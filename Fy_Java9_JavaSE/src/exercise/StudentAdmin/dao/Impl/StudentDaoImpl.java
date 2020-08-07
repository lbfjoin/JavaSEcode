package exercise.StudentAdmin.dao.Impl;


import exercise.StudentAdmin.dao.StudentDao;
import exercise.StudentAdmin.domain.Student;
import exercise.StudentAdmin.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lbf
 * @date 2020/8/6 15:59
 */
public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> findAll() throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = " select * from studentManage";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            ArrayList<Student> list = new ArrayList<>();
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt(1));
                student.setName(rs.getString(2));
                student.setGender(rs.getString(3));
                student.setScore(rs.getInt(4));
                student.setAddr(rs.getString(5));
                student.setTel(rs.getString(6));
                list.add(student);

            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(rs, pstmt, conn);
        }
        return null;
    }

    @Override
    public void save(Student student) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = JDBCUtils.getConnection();
            conn.setAutoCommit(false);
            String sql = " insert into studentManage values (null,?,?,?,?,?) ";
            pstmt = conn.prepareStatement(sql);


            pstmt.setString(1, student.getName());
            pstmt.setString(2, student.getGender());
            pstmt.setInt(3, student.getScore());
            pstmt.setString(4, student.getAddr());
            pstmt.setString(5, student.getTel());
            pstmt.executeUpdate();

            conn.commit();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(null, pstmt, conn);
        }
    }

    @Override
    public void remove(Integer id) {
        Connection conn = null;
        PreparedStatement pstmt = null;


        try {
            conn = JDBCUtils.getConnection();
            conn.setAutoCommit(false);
            String sql = " delete from studentManage where id = ? ";
            pstmt = conn.prepareStatement(sql);


            pstmt.setInt(1, id);
            pstmt.executeUpdate();


            conn.commit();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(null, pstmt, conn);
        }
    }


    @Override
    public void update(Student student) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = JDBCUtils.getConnection();
            conn.setAutoCommit(false);
            String sql = " update studentManage set score = ? where id = ? ";
            pstmt = conn.prepareStatement(sql);


            pstmt.setInt(1, student.getScore());
            pstmt.setInt(2, student.getId());
            pstmt.executeUpdate();


            conn.commit();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(null, pstmt, conn);
        }
    }
}

