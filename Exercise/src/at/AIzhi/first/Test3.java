package at.AIzhi.first;

import java.util.Scanner;

/**
 * @author wms
 * @create 2021-04-16-9:16
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        String[] arr = new String[n + 1];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.next();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }


    }
}
