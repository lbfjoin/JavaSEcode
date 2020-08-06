package exercise.StudentAdmin.dao;

import exercise.StudentAdmin.domain.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentDao {
    //学生列表 查询所有学生
    public List<Student> findAll() throws SQLException;
    //保存某个学生
    public void save(Student student);
    //删除某个学生
    public void remove(Integer id);
    //修改某个学生
    public void update(Student student);
}
