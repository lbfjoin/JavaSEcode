package exercise.StudentAdmin.domain;

import java.util.Objects;

/**
 * @author lbf
 * @date 2020/8/6 15:49
 */
public class Student {
    //JavaBean
    private int id;
    private String name;
    private String gender;
    private int score;
    private String addr;
    private String tel;

    public Student() {
    }

    public Student(int id, String name, String gender, int score, String addr, String tel) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.score = score;
        this.addr = addr;
        this.tel = tel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                score == student.score &&
                name.equals(student.name) &&
                gender.equals(student.gender) &&
                addr.equals(student.addr) &&
                tel.equals(student.tel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, gender, score, addr, tel);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", score=" + score +
                ", addr='" + addr + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
