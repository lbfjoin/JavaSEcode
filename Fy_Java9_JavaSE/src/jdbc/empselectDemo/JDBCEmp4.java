package jdbc.empselectDemo;

import jdbc.empselectDemo.domain.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lbf
 * @date 2020/8/6 8:01
 */
public class JDBCEmp4 {
    public static void main(String[] args) throws SQLException {
        List<Emp> list = new JDBCEmp4().findAll();
        for (Emp emp:list){
            System.out.println(emp);
        }

    }
    public List<Emp> findAll() throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Emp> list = null;
        try{
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java9","root","root"
            );
            String sql = "select * from emp";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            list = new ArrayList<>();
            while (rs.next()){
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
        }catch (ClassCastException e){
            e.printStackTrace();
        }finally {

            if ( stmt != null){
                try {
                    stmt.close();
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
            if (rs != null){
                try {

                    rs.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
}
