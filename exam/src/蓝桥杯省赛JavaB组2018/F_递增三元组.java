package 蓝桥杯省赛JavaB组2018;

import java.util.Scanner;

/**
 *
 标题：递增三元组

 给定三个整数数组
 A = [A1, A2, ... AN],
 B = [B1, B2, ... BN],
 C = [C1, C2, ... CN]，
 请你统计有多少个三元组(i, j, k) 满足：

 1. 1 <= i, j, k <= N
 2. Ai < Bj < Ck

 【输入格式】
 第一行包含一个整数N。
 第二行包含N个整数A1, A2, ... AN。
 第三行包含N个整数B1, B2, ... BN。
 第四行包含N个整数C1, C2, ... CN。

 对于30%的数据，1 <= N <= 100
 对于60%的数据，1 <= N <= 1000
 对于100%的数据，1 <= N <= 100000 0 <= Ai, Bi, Ci <= 100000

 【输出格式】
 一个整数表示答案

 【输入样例】
 3
 1 1 1
 2 2 2
 3 3 3

 【输出样例】
 27


 资源约定：
 峰值内存消耗（含虚拟机） < 256M
 CPU消耗  < 1000ms


 请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。
 所有代码放在同一个源文件中，调试通过后，拷贝提交该源码。
 不要使用package语句。不要使用jdk1.7及以上版本的特性。
 主类的名字必须是：Main，否则按无效代码处理。


 * @author wms
 * @create 2021-04-14-9:45
 */
public class F_递增三元组 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        int[] n1 = new int[n];
//        int[] n2 = new int[n];
//        int[] n3 = new int[n];

//        for (int i = 0; i < n1.length; i++) {
//            n1[i] = scan.nextInt();
//        }
//        for (int i = 0; i < n2.length; i++) {
//            n2[i] = scan.nextInt();
//        }
//        for (int i = 0; i < n3.length; i++) {
//            n3[i] = scan.nextInt();
//        }
        int n = scan.nextInt();
        int[][] arr = new int[3][n];

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                if (arr[1][j] <= arr[0][i]){
                    continue;
                }
                for (int k = 0; k < arr[2].length; k++) {
                    if (arr[2][k] <= arr[1][j]){
                        continue;
                    }
                    sum++;
                }
            }
        }
        scan.close();
        System.out.println(sum);
    }
}
