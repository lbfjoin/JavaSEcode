package jdbc;

import java.sql.*;

/**
 * @author lbf
 * @date 2020/8/5 9:22
 */
public class JDBCDemo5 {
    //查询
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java9", "root", "root");
            String sql = "select * from account";
            stmt = conn.createStatement();
            //封装查询结果
            rs = stmt.executeQuery(sql);
            //类似于迭代器
            //让游标移动一下
            rs.next();
            int id = rs.getInt(1);
            String name = rs.getString("name");
            int balance = rs.getInt(3);
            System.out.println("id:" + id + "name: "+ name + "balance：" + balance);
            rs.next();
            int id2 = rs.getInt("id");
            String name2 = rs.getString("name");
            int balance2 = rs.getInt(3);
            System.out.println("id:" + id2 + "name: "+ name2 + "balance：" + balance2);


        } catch (ClassCastException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
            ;
        } finally {
            //释放资源
            if (stmt != null) {
                try {
                    stmt.close();

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    conn.close();
                    ;

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    rs.close();


                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }


    }
}
