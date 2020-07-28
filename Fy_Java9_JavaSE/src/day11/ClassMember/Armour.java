package day11.ClassMember;

/**
 * @author lbf
 * @date 2020/7/25 11:48
 */
public class Armour {
    String name;
    int protect; //防御

    public Armour() {
    }

    public Armour(String name, int protect) {
        this.name = name;
        this.protect = protect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProtect() {
        return protect;
    }

    public void setProtect(int protect) {
        this.protect = protect;
    }
}
