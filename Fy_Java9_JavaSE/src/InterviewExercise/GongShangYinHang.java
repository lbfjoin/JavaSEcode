package InterviewExercise;

/**
 * @author lbf
 * @date 2020/8/3 19:23
 */
public class GongShangYinHang  {
    private int money;
    private int zhangHao;
    private String name;

    public GongShangYinHang() {
    }

    public GongShangYinHang(int money, int zhangHao, String name) {
        this.money = money;
        this.zhangHao = zhangHao;
        this.name = name;
    }
    public static  void countyin(int lendmoney){
        if (lendmoney > 3){
            System.out.println("超过借钱范围");
        }
        int year = 0;
        double loweststart = lendmoney + 0.05*lendmoney;
         while (loweststart <= 5) {
             loweststart = lendmoney + 0.05*lendmoney*year++;
         }
             System.out.println("已经到了最低透支额，不能再透支了,最高透支" + year++ +"年");

    }
    public static double count(double lendMoneyCount){

      return lendMoneyCount;
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
