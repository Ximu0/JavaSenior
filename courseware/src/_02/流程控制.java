package _02;

import java.util.Scanner;

/**
 * @author wms
 * @create 2021-04-27-16:24
 */
public class 流程控制 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String season = scan.next();

        switch(season){
            case "spring":
                System.out.println("春暖花开");
                break;

            case "summer":
                System.out.println("夏日炎炎");
                break;

            case "autumn":
                System.out.println("秋高气爽");
                break;

            case "winter":
                System.out.println("冬雷震震");
                break;

            default:
                System.out.println("季节输入错误");
                break;
        }
    }
}
