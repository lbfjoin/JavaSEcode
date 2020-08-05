package InterviewExercise;

/**
 * @author lbf
 * @date 2020/8/3 19:37
 */
public class NongYeYinHang {
    private int money;
    private int zhangHao;
    private String name;

    public NongYeYinHang() {
    }

    public NongYeYinHang(int money, int zhangHao, String name) {
        this.money = money;
        this.zhangHao = zhangHao;
        this.name = name;
    }
       public static void  countFeature(double saveMoney,int year) {
           int i = 0;
           double featureMoney = 0;
           while (i <= year) {
               featureMoney = saveMoney + saveMoney * 0.03 * year++;
               i++;
           }
           System.out.println("在" + year + "后，获得金额为" + featureMoney );
       }





    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getZhangHao() {
        return zhangHao;
    }

    public void setZhangHao(int zhangHao) {
        this.zhangHao = zhangHao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
