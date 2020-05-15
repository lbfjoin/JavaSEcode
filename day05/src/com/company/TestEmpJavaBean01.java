package com.company;

/**
 * @author lbf
 * @date 2020/5/14 22:21
 */
public class TestEmpJavaBean01 {
    public static void main(String[] args) {
        EmpJavaBean01 e = new EmpJavaBean01("lbf",18,123456789,99999);
        System.out.println(e.getName() + "=====" + e.getAge()+ "=====" + e.getSno() + "=====" + e.getSalary());
        EmpJavaBean01 e1 = new EmpJavaBean01();
        e1.setName("lbf");
        e1.setAge(11);
        e1.setSno(11111);
        e1.setSalary(99999);
        System.out.println(e1.getName() + "=====" + e1.getAge()+ "=====" + e1.getSno() + "=====" + e1.getSalary());

    }
}
