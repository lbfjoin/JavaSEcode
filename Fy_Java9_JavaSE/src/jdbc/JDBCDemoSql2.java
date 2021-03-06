package jdbc;

import jdbc.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author lbf
 * @date 2020/8/6 14:55
 */
public class JDBCDemoSql2 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        PreparedStatement pstmt2 = null;
        ResultSet rs = null;
        try{
            conn = JDBCUtils.getConnection();
            String sql = "update account set balance = balance + ? where id = ?";
            String sql2 = "update account set balance = balance - ? where id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt2 = conn.prepareStatement(sql2);
            pstmt.setInt(1,500);
            pstmt.setInt(2,1);

            pstmt2.setInt(1,500);
            pstmt2.setInt(2,2);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
