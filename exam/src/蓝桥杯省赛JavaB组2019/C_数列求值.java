package 蓝桥杯省赛JavaB组2019;


/**
 给定数列1, 1, 1, 3, 5, 9, 17, …，从第4 项开始，
 每项都是前3项的和。求第20190324 项的最后4 位数字。
 *
 * 解题思路：
 * 使用迭代法，因为数字太大，每次对10000取余。
 * @author wms
 * @create 2021-04-09-18:58
 */
public class C_数列求值 {

    public static void main(String[] args) {
        //方法一：
//        int n = 20190324;
//        int a = 1;
//        int b = 1;
//        int c = 1;
//        long start = System.currentTimeMillis();
//
//        for (int i = 4; i <= n; i++) {
//            if (i % 3 == 1) {
//                a = (a + b + c)  % 10000;
//            }else  if (i % 3 == 2) {
//                b = (a + b + c) % 10000;
//            }else{
//                c = (a + b + c) % 10000;
//            }
//        }
//
//        if (n % 3 == 1){
//            System.out.println(a);
//        } else if (n % 3 == 2) {
//            System.out.println(b);
//        }else{
//            System.out.println(c);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);

        //方法二：
        int n = 20190324;
        long[] a = new long[n];
        a[0] = a[1] = a[2] =1;

        long start = System.currentTimeMillis();

        for (int i = 3; i < n; i++) {
            a[i] = (a[i - 1] + a[i -2] + a[i -3]) % 10000;
        }
        System.out.println(a[n - 1]);

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

}
