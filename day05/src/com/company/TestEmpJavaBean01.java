package com.company;

/**
 * @author lbf
 * @date 2020/5/14 22:21
 */
public class TestEmpJavaBean01 {
    public static void main(String[] args) {
        EmpJavaBean01 e = new EmpJavaBean01();
        e.setName("lbf");
        e.setAge(22);
        e.setJobNO(258464);
        e.setSalary(99999);
        System.out.println(e.getName() + "-----" + e.getAge() + "-----" + e.getJobNO() + "-----" + e.getSalary());
        System.out.println("==========");
        EmpJavaBean01 e1 = new EmpJavaBean01("lbf", 22, 3333333, 44444444);
        System.out.println(e1.getName()+ "-----" + e1.getAge() + "-----" + e1.getJobNO() + "-----" + e1.getSalary() );
    }
}
