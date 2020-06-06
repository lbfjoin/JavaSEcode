package com.company;

/**
 * @author lbf
 * @date 2020/5/14 22:21
 */
public class TestEmpJavaBean01 {
    public static void main(String[] args) {
        EmpJavaBean01 e = new EmpJavaBean01();
        e.getName();
        e.getAge();
        e.getWages();
        e.getOccupation();
        System.out.println(e.getName() + "===" + e.getAge() + "===" + e.getWages() + "===" + e.getOccupation());
        EmpJavaBean01.showNumber();
        EmpJavaBean01 e1 = new EmpJavaBean01("lbf", 22, 88888, "boss");
        System.out.println(e1.getName() + "===" + e1.getAge() + "===" + e1.getWages() + "===" + e1.getOccupation());
        EmpJavaBean01.showNumber();
    }
}
