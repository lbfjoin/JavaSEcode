package com.company;

public class TypeDemo04 {
//    数据类型转换
//    如果数据类型不一致，需要进行数据类型转换
//    1.自动类型转换，也叫隐式转换
//     是指小类型自动转化成大类型 （取值范围小的类型自动提升为取值范围大的类型）
//   定义两个int类型的变量a和b, 分别赋值为10, 20.
public static void main(String[] args) {
    int a = 10;
    int b = 20;
//    通过输出语句打印变量a和b的和.
    System.out.println(a + b);

//    定义int类型的变量c, 接收变量a和b的和
    int c;
    c = a + b;
//    打印变量c的值.
    System.out.println(c);
//    定义两个变量aa和bb, 一个是int类型的数据, 另一个是byte类型的数据.
    int aa = 11;
    byte bb = 22;
//   定义变量cc接收 变量aa和bb的和.
     int cc = aa + bb;
//   分别设置变量cc的数据类型为byte类型和int类型, 观察结果并打印.
    System.out.println(cc);
//    2.强制类型转换，也叫显示转换 大类型-->小类型
       double d = 30.5;
//       数据类型 变量名 = （强制转换的类型）要被转换的数值
       int dd = (int)d;
    System.out.println(dd);

//
//

}
}
