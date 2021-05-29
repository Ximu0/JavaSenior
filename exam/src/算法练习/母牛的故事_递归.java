package 算法练习;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author wms
 * @create 2021-04-15-12:17
 */
public class 母牛的故事_递归 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        while (year != 0){
            arr.add(year);
            year = scan.nextInt();
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(cowNum(arr.get(i)));
        }
        scan.close();
    }
    public static int cowNum(int year){
        if (year == 1){
            return 1;
        }
        if (year == 2){
            return 2;
        }
        if (year == 3){
            return 3;
        }
        if (year == 4){
            return 4;
        }

        return cowNum(year - 1) + cowNum(year - 3);
    }
}
