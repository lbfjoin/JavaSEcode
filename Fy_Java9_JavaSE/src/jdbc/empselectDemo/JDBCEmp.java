package jdbc.empselectDemo;


import jdbc.empselectDemo.domain.Emp;
import jdbc.utils.JDBCUtils;


import java.sql.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lbf
 * @date 2020/8/5 9:48
 */
public class JDBCEmp {
    public static void main(String[] args) throws SQLException {
        // 定义一个方法 查询emp表中所有的数据
//        List<Emp> list = new JDBCEmp().findAll();
//        for (Emp emp : list) {
//            System.out.println(emp);
//        }
//        findAll();
        List<Emp> list = new JDBCEmp().findAllUseJDBCUtils();
        for (Emp emp:list){
            System.out.println(emp);
        }
    }

    public List<Emp> findAll() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Emp> list = null;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java9", "root", "root");
            String sql = "select * from emp";
            stmt = conn.createStatement();
            // 封装查询结果
            rs = stmt.executeQuery(sql);

            list = new ArrayList<>();

            while (rs.next()) {
                // TODO
                Emp emp = new Emp();
                emp.setId(rs.getInt(1));
                emp.setEname(rs.getString(2));
                emp.setJob(rs.getString(3));
                emp.setMgr(rs.getInt(4));
                emp.setHiredate(rs.getDate(5));
                emp.setSalary(rs.getInt(6));
                emp.setBonus(rs.getInt(7));
                emp.setDeptno(rs.getInt(8));
//                System.out.print(emp.getId() + "\t");
//                System.out.print(emp.getEname()+ "\t");
//                System.out.print(emp.getJob()+ "\t");
//                System.out.print(emp.getMgr()+ "\t");
//                System.out.print(emp.getHiredate()+ "\t");
//                System.out.print(emp.getSalary()+ "\t");
//                System.out.print(emp.getBonus()+ "\t");
//                System.out.print(emp.getDeptno());
//                System.out.println();
                //添加进集合
                list.add(emp);
            }


        } catch (ClassCastException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 释放资源

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


        }
        return list;
    }

    /**
     * 演示JDBCUtils
     */
    public List<Emp> findAllUseJDBCUtils() throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Emp> list = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "select * from emp";
            stmt = conn.createStatement();
            // 封装查询结果
            rs = stmt.executeQuery(sql);

            list = new ArrayList<>();

            while (rs.next()) {
                // TODO
                Emp emp = new Emp();
                emp.setId(rs.getInt(1));
                emp.setEname(rs.getString(2));
                emp.setJob(rs.getString(3));
                emp.setMgr(rs.getInt(4));
                emp.setHiredate(rs.getDate(5));
                emp.setSalary(rs.getInt(6));
                emp.setBonus(rs.getInt(7));
                emp.setDeptno(rs.getInt(8));
                list.add(emp);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,stmt,conn);
        }
        return list;
    }
}
