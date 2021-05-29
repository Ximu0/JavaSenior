package 蓝桥杯省赛JavaB组2019;

import java.util.Scanner;

/**
 * 小明对数位中含有2、0、1、9 的数字很感兴趣（不包括前导0），在1 到
 * 40 中这样的数包括1、2、9、10 至32、39 和40，共28 个，他们的和是574。
 * 请问，在1 到n 中，所有这样的数的和是多少？
 * 输入：
 * 输入一行包含一个整数n。
 * 输出：
 * 输出一行，包含一个整数，表示满足条件的数的和。
 * 【样例输入】
 * 40
 * 【样例输出】
 * 574
 *
 * 解题思路：
 * 这道题比较简单，直接判断1-n中的每位数字是否包含2/0/1/9数字，如果包含累加即可。
 * @author wms
 * @create 2021-04-09-22:20
 */
public class F_特别数的和 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long sum = 0;

        for (int i = 1; i <= n; i++) {
            if (check(i)){
                sum += i;
            }
        }

        System.out.println(sum);
    }

    static boolean check(int i){
        char[] arr = String.valueOf(i).toCharArray();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == '2' || arr[j] == '0' || arr[j] == '1' || arr[j] == '9'){
                return true;
            }
        }
        return false;
    }

}
