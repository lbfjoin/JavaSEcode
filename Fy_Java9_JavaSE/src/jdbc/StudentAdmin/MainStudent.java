package jdbc.StudentAdmin;

import com.alibaba.druid.sql.visitor.SQLASTOutputVisitorUtils;
import exercise.StudentAdmin.dao.StudentDao;
import jdbc.StudentAdmin.dao.Impl.StudentDaoImpl;
import jdbc.StudentAdmin.domain.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lbf
 * @date 2020/8/6 15:47
 */
public class MainStudent {
    public static void main(String[] args) {
        System.out.println("----欢迎登陆low版学生管理系统----");
        StudentDaoImpl studentDao = new StudentDaoImpl();
        System.out.println("--------学生列表------------");
        List<Student> list = studentDao.findAll();
        for (Student s : list) {
            System.out.println(s);
        }
//        System.out.println("--------保存学生------------");
//        // new Student
//        //studentDao.save();
//        Student student = new Student(2,"李四","男",66,"沈阳","55555555");
//        StudentDaoImpl studentDao1 = new StudentDaoImpl();
//        studentDao.save(student);
//        List<Student> list1 = studentDao1.findAll();
//        for (Student s:list1){
//            System.out.println(s);
//        }
        System.out.println("----------删除学生----------");
        //删除
        StudentDaoImpl studentDao2 = new StudentDaoImpl();
        studentDao2.remove(2);
        List<Student> students = studentDao2.findAll();
        for (Student s : students) {
            System.out.println(s);
        }

        //修改
        System.out.println("----------修改学生----------");
        StudentDaoImpl studentDao3 = new StudentDaoImpl();
        Student student1 = new Student(1, "张三", "男", 90, "锦州", "666666666");
        studentDao3.update(student1);
        List<Student> list3 = studentDao.findAll();
        for (Student s : list3) {
            System.out.println(s);
        }
    }
}
