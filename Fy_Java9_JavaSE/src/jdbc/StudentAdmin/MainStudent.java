package jdbc.StudentAdmin;

import com.alibaba.druid.sql.visitor.SQLASTOutputVisitorUtils;
import jdbc.StudentAdmin.dao.Impl.StudentDaoImpl;
import jdbc.StudentAdmin.domain.Student;

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
        List<Student> list = studentDao.finndAll();
        for (Student s:list){
            System.out.println(s);
        }
        System.out.println("--------保存学生------------");
        // new Student
        //studentDao.save();

        //修改

        //删除
    }
}
