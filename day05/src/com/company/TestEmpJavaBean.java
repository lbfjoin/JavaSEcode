package com.company;

/**
 * @author lbf
 * @date 2020/5/10 15:05
 */
public class TestEmpJavaBean {
    public static void main(String[] args) {
        EmpJavaBean e1 = new EmpJavaBean();
        e1.setName("111");
        e1.setOccupation("boss");
        e1.setSno(560000000);
        e1.setWages(9999);
        System.out.println(e1.getName() +"-------" + e1.getOccupation() + "-------" + e1.getSno() + "-------" + e1.getWages());
        EmpJavaBean e = new EmpJavaBean("lbf",1111,"boss",999999);
        System.out.println(e.getName() +"-------" + e.getOccupation() + "-------" + e.getSno() + "-------" + e.getWages());
    }
}
