package _03;

import java.util.Scanner;

/**
 * 3. 编写程序：从键盘上输入2021年的“month”和“day”，要求通过程序
 * 输出输入的日期为2021年的第几天。
 * @author wms
 * @create 2021-04-27-17:21
 */
public class switch_case3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("输入月");
        int month = scan.nextInt();
        System.out.println("输入日");
        int day = scan.nextInt();

        int  sumDay = 0;

        switch(month){
            case 12:
                sumDay+=30;
            case 11:
                sumDay+=31;
            case 10:
                sumDay+=30;
            case 9:
                sumDay+=31;
            case 8:
                sumDay+=31;
            case 7:
                sumDay+=30;
            case 6:
                sumDay+=31;
            case 5:
                sumDay+=30;
            case 4:
                sumDay+=31;
            case 3:
                sumDay+=28;
            case 2:
                sumDay+=31;
            case 1:
                sumDay+=day;
                break;
        }
        System.out.println(sumDay);
    }
}
