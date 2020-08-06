package exercise.StudentAdmin;

import exercise.StudentAdmin.dao.Impl.StudentDaoImpl;
import exercise.StudentAdmin.dao.StudentDao;
import exercise.StudentAdmin.domain.Student;
import exercise.StudentAdmin.utils.JDBCUtils;
import jdbc.empselectDemo.domain.Emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lbf
 * @date 2020/8/6 15:47
 */
public class MainStudent {
    public static void main(String[] args) throws SQLException {
        System.out.println("----欢迎登陆low版学生管理系统----");
        StudentDaoImpl studentDao = new StudentDaoImpl();
        System.out.println("--------学生列表------------");
        List<Student> list = studentDao.findAll();
        for (Student s : list) {
            System.out.println(s);
        }
        System.out.println("--------保存学生------------");
        // new Student
        //studentDao.save();

        StudentDaoImpl studentDao3 = new StudentDaoImpl();
        Student student = new Student(2,"李四","男",60,"沈阳","666666666");
        studentDao3.save(student);
        List<Student> list4 = studentDao.findAll();
        for (Student s : list4) {
            System.out.println(s);
        }
        System.out.println("--------删除------------");
        //删除
        StudentDaoImpl studentDao1 = new StudentDaoImpl();
            studentDao1.remove(2);
            List<Student> list2 = studentDao.findAll();
            for (Student s : list2) {
                System.out.println(s);
        }
//        //修改
        System.out.println("--------修改------------");
        StudentDao studentDao2 = new StudentDaoImpl();
        Student student1 = new Student(1,"张三","男",60,"锦州","666666666");
        studentDao2.update(student1);
        List<Student> list3 = studentDao.findAll();
        for (Student s : list3) {
            System.out.println(s);
        }


    }
    }


