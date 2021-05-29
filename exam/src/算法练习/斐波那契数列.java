package 算法练习;

import java.util.Scanner;

/**
 * @author wms
 * @create 2021-04-11-20:35
 */
public class 斐波那契数列 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
//        int[] arr = new int[n + 2];
//
//        arr[0] = 0;
//        arr[1] = 1;
//
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//
//        for (int i = 2; i < n + 2; i++) {
//            arr[i] = arr[i - 1] + arr[i - 2];
//            System.out.println(arr[i]);
//        }

        System.out.println(Fibonacci_Recursion(n));
    }

    public static int Fibonacci_Recursion(int num){

        if (num == 1){
            return 0;
        }

        if (num == 2){
            return 1;
        }

        return Fibonacci_Recursion(num - 1) + Fibonacci_Recursion(num - 2);

    }


}
