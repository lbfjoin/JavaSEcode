package jdbc;

import jdbc.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author lbf
 * @date 2020/8/6 14:33
 */
public class JDBCLoginDemo3 {
    public static void main(String[] args) {

    }
    public boolean login(String userName,String password){
        if (userName != null || password != null){
            return false;
        }
        Connection conn = null ;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try{
            conn = JDBCUtils.getConnection();
            String sql = "select * from user where username = ? and password = ? ";
            System.out.println(sql);
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,userName);
            pstmt.setString(2,password);
            rs = pstmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {

        }
        return false;
    }
}
