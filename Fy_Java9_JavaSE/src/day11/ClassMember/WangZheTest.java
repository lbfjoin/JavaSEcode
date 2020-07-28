package day11.ClassMember;

/**
 * @author lbf
 * @date 2020/7/25 14:27
 */
public class WangZheTest {
    public static void main(String[] args) {
        WangZheRole role = new WangZheRole();
        role.setFaShuSkill(new FaShuSkill() {
            @Override
            public void faShuAttack() {
                System.out.println("安琪拉的羊肉串");
            }
        });
        role.faShuSkillAttack();
    }
}
