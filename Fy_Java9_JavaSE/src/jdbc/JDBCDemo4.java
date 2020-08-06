package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author lbf
 * @date 2020/8/5 9:15
 */
public class JDBCDemo4 {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java9", "root", "root");

//            String sql = "insert  into account values (null ,'赵六',1000)";
//            String sql = "update account set balance = 20000 where id = 2";
            String sql = "delete from account where id = 4";
            stmt = conn.createStatement();
            int count = stmt.executeUpdate(sql);//返回受影响的行数
//        7、处理结果
            if (count > 0) {
                System.out.println("删除成功");
            }else {
                System.out.println("添加失败");
            }

        }catch (ClassCastException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();;
        }finally {
            //释放资源
            if (stmt != null){
                try {
                    stmt.close();

                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (stmt != null){
                try {
                    conn.close();;

                }catch (SQLException e){
                    e.printStackTrace();
                }
            }

        }


    }

}
