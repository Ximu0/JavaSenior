package at.AIzhi.first;

import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int countPositive = 0;
        int countNegative = 0;
        int count = 0;
        int value, sum = 0;
        // TODO 编写代码，统计正数个数、负数个数和n个整数之和以及平均数的值
        boolean flag = true;
        do{
            value = in.nextInt();
            if (value != 0) {
                count++;
                if (value > 0) {
                    countPositive++;
                }
                if (value < 0) {
                    countNegative++;
                }
                sum+=value;
            }else {
                flag = false;
            }
        }while(flag);

        // 输出结果
        if(count == 0)
            System.out.println("No input");
        else {
            System.out.println(countPositive);
            System.out.println(countNegative);
            System.out.println(sum);
            System.out.printf("%.2f\n", (sum * 1.0 / count));
        }
        in.close();
    }
}