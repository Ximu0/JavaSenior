package _03;

import java.util.Scanner;

/**
 * 2.对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。
 * @author wms
 * @create 2021-04-27-17:15
 */
public class switch_case2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int score = scan.nextInt();

//        switch(score / 10){
//            case 0:
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("成绩不合格！建议回炉重造");
//                break;
//
//            case 6:
//            case 7:
//            case 8:
//            case 9:
//            case 10:
//                System.out.println("合格！");
//                break;
//        }


        switch(score / 60){
            case 0:
                System.out.println("成绩不合格！建议回炉重造");
            case 1:
                System.out.println("合格！");
        }

    }

}
