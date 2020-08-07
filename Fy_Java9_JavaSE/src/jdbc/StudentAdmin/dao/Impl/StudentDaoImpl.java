package jdbc.StudentAdmin.dao.Impl;

import jdbc.StudentAdmin.dao.StudentDao;
import jdbc.StudentAdmin.domain.Student;
import jdbc.StudentAdmin.utils.JDBCUtils;

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
    public List<Student> findAll() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = JDBCUtils.getConnection();
            conn.setAutoCommit(false);
            String sql = "select * from studentManage ";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery(sql);
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

                conn.commit();
            }

            return list;
        } catch (SQLException e1) {
            try {

                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public void save(Student student) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try{
            conn = JDBCUtils.getConnection();
            String sql = "insert into studentManage values (?,?,?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
              //传入的是sudent类型参数，不需要重新new Student
            pstmt.setInt(1,student.getId());
            pstmt.setString(2, student.getName());
            pstmt.setString(3, student.getGender());
            pstmt.setInt(4, student.getScore());
            pstmt.setString(5, student.getAddr());
            pstmt.setString(6, student.getTel());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(null,pstmt,conn);
        }
    }

    @Override
    public void remove(Integer id) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try{
            conn = JDBCUtils.getConnection();
            String sql = "delete from studentManage where id = ?";
            pstmt = conn.prepareStatement(sql);
         //传入的是sudent类型参数，不需要重新new Student
            pstmt.setInt(1,id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(null,pstmt,conn);
        }

    }

    @Override
    public void update(Student student) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try{
            conn = JDBCUtils.getConnection();
            String sql = "update  studentManage  set score = ? where id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,student.getScore());
            pstmt.setInt(2,student.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(null,pstmt,conn);
        }
    }
}
