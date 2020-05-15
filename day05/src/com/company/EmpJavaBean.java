package com.company;

/**
 * @author lbf
 * @date 2020/5/10 14:57
 */
public class EmpJavaBean { // ALt + insert ----》Constructor 生成构造函数 ------->getters and setters
    //员工姓名
    private String name;
    //工号
    private int sno;
    //职位
    private String occupation;
    //薪资
    private int wages;

    public EmpJavaBean() {
    }

    public EmpJavaBean(String name, int sno, String occupation, int wages) {
        this.name = name;
        this.sno = sno;
        this.occupation = occupation;
        this.wages = wages;
    }

    public String getName() {
        return name;
    }

    public int getSno() {
        return sno;
    }

    public String getOccupation() {
        return occupation;
    }

    public int getWages() {
        return wages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setWages(int wages) {
        this.wages = wages;
    }
    //编写对应测试类
}
