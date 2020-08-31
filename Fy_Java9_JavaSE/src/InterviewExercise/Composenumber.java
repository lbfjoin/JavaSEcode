package InterviewExercise;

/**
 * @author lbf
 * @date 2020/8/19 18:20
 */
public class Composenumber {
    //题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
    //程序分析：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去 掉不满足条件的排列。
//    public static void main(String[] args) {
//        int ge = 0;
//        int shi = 0;
//        int bai = 0;
//        int count = 0;
//
//        for (int i = 1; i < 5; i++) {
//            ge = i;
//            for (int j = 1; j < 5; j++) {
//                shi = j;
//                for (int k = 1; k < 5; k++) {
//                    bai = k;
//                    if (ge != shi && ge != bai && shi != bai) {
//                        int num = ge + shi * 10 + bai * 100;
//                        count++;
//                        System.out.print(num + "\t");
//                    }
//                }
//            }
//
//
//        }
//        System.out.println();
//        System.out.println(count);
//    }
    public static void main(String[] args) {
        diffNum();
    }

    public static void diffNum() {

        int arr[] = {1, 2, 3, 4};
        int count = 0;

        for (Integer bai : arr
        ) {

            for (Integer shi : arr
            ) {
                if (shi.equals(bai)) {
                    continue;
                } else {
                    for (Integer ge : arr
                    ) {
                        if (ge.equals(shi) || ge.equals(bai)) {
                            continue;
                        } else {
                            System.out.print(bai * 100 + shi * 10 + ge + "\t");
                            count++;
                        }
                    }

                }
                System.out.println();


            }
        }
        System.out.println("一共有" + count + "个不同组合");


    }

}
