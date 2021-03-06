package jdbc.empselectDemo;

import jdbc.empselectDemo.domain.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lbf
 * @date 2020/8/6 7:44
 */
public class JDBCEmp3 {
    public static void main(String[] args) throws SQLException {
        List<Emp> list = new JDBCEmp3().findAll();
        for (Emp emp:list){
            System.out.println(emp);
        }

    }
    public List<Emp> findAll() throws SQLException {
        ArrayList<Emp> list = null;
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {

            list = new ArrayList<>();
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java9", "root", "root"
            );
            String sql = "select * from emp";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Emp emp = new Emp();
                emp.setId(rs.getInt("empno"));
                emp.setEname(rs.getString(2));
                emp.setJob(rs.getString(3));
                emp.setMgr(rs.getInt(4));
                emp.setHiredate(rs.getDate(5));
                emp.setSalary(rs.getInt(6));
                emp.setBonus(rs.getInt(7));
                emp.setDeptno(rs.getInt(8));
                list.add(emp);
            }
        }catch (ClassCastException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            if (stmt != null){
                try {

                    stmt.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (rs != null){
                try{
                    rs.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }

            }
            if (conn != null){
                try {
                    conn.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
}
