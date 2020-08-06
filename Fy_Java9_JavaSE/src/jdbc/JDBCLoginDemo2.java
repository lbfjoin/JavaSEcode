package jdbc;

import jdbc.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/8/6 11:40
 */
public class JDBCLoginDemo2 {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = scanner.nextLine();
        System.out.println("请输入用户密码");
        String password = scanner.nextLine();
        boolean flag = new JDBCLoginDemo2().login(username, password);
        if (flag){
            System.out.println("登陆成功");
        }
        else {
            System.out.println("用户名或密码错误");
        }
    }
    public boolean login(String userName,String password) throws SQLException {
        if (userName == null || password == null){
            return false;
        }
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {

            conn = JDBCUtils.getConnection();
            String sql = "select * from user where username = '" + userName + "' and password = '" + password + "'";
            System.out.println(sql);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            return rs.next();
        }catch (SQLException e ){
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs, stmt, conn);
        }
        return false;
    }
}
