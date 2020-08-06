package jdbc.StudentAdmin.domain;

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
}
