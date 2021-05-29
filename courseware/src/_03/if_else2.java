package _03;

import java.util.Scanner;

/**
 *
 *  我家的狗5岁了，5岁的狗相当于人类多大呢？其实，狗的前两年每
 * 一年相当于人类的10.5岁，之后每增加一年就增加四岁。那么5岁的狗
 * 相当于人类多少年龄呢？应该是：10.5 + 10.5 + 4 + 4 + 4 = 33岁。
 *
 * @author wms
 * @create 2021-04-27-17:04
 */
public class if_else2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        if (age <= 0){
            System.out.println("还未出生");
        } else if (age <= 2){
            System.out.println(age * 10.5);
        } else if(age > 2){
            System.out.println((age - 2) * 4 + 21);
        }

    }
}
