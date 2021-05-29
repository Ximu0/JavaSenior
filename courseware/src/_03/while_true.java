package _03;

import java.util.Scanner;

/**
 * 题目：
 * 从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入
 * 为0时结束程序。
 * 最简单“无限” 循环格式：while(true) , for(;;),无限循环存在的原因是并不
 * 知道循环多少次，需要根据循环体内部某些条件，来控制循环的结束。
 * @author wms
 * @create 2021-04-27-17:33
 */
public class while_true {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int positiveNum = 0;
        int negativeNum = 0;

        while (true){

            int i = scan.nextInt();

            if (i > 0){
                positiveNum++;
            }else if(i < 0){
                negativeNum++;
            }else{
                break;
            }

        }

        System.out.println("正数的个数" + positiveNum);
        System.out.println("负数的个数" + negativeNum);

    }

}
