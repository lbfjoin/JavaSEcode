package jdbc;

import jdbc.utils.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/8/6 11:04
 */
public class JDBCLoginDemo {
    public static void main(String[] args) {
         // 键盘录入，接受用户名和密码
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的用户名");
        String userName = scanner.nextLine();
        System.out.println("请输入您的用户密码");
        String password = scanner.nextLine();
        //编写一个方法 Login 判断用户的用户名和密码是否正确
//        boolean flag = new JDBCLoginDemo().login(userName, password);
        boolean flag = new JDBCLoginDemo().login2(userName, password);
        if (flag){
            System.out.println("登陆成功");
        }else {
            System.out.println("用户名或密码错误");
        }
    }
    public boolean login(String userName,String password){
        //判断是否为空
        if (userName == null || password == null){
            return false;
        }
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
             conn = JDBCUtils.getConnection();
             String sql = "select * from user where username = '"+ userName+"'and password = '"+ password+"'";
//            StringBuilder sql2 = new StringBuilder("select * from user where username = '")
//                    .append(userName).append("'and password = '").append(password).append("'");
            System.out.println(sql);
//            System.out.println(sql2);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            return  rs.next(); //如果有下一行，就返回true

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs, stmt, conn);
        }
        return false;
    }
    public boolean login2(String userName,String password){
        //判断是否为空
        if (userName == null || password == null){
            return false;
        }
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "select * from user where username = ? and password = ?";
            System.out.println(sql);
            //先获取值执行sql的对象 PrepareStatement
            pstmt = conn.prepareStatement(sql);
            //给？复制
            pstmt.setString(1,userName);
            pstmt.setString(2,password);
            //执行查询，不需要传递sql
            rs = pstmt.executeQuery();
//            if (rs.next()){
//                return true;
//            }else {
//                return false;
//            }
            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs, pstmt, conn);
        }
        return false;
    }
}
