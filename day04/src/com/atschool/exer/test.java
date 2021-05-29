package com.atschool.exer;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wms
 * @create 2021-03-21-21:48
 */
public class test {
    public static void main(String[] args) {
//        double d = 3.1415926;
//
//
//
//        System.out.printf("",(int)d);

        Scanner sc = new Scanner(System.in);
        String strs = sc.nextLine();
        System.out.println("-----------" + strs + "---------------");

        String[] str;
        str = strs.split(";");
        for (int i = 0; i < str.length; i++) {
            System.out.println("str[" + i + "] = " + str[i]);
        }
        System.out.println();

        //String[] strss[] = new String[str.length][];
        String[] strss[] = new String[str.length][str[0].length()];
        for (int i = 0; i < str.length; i++) {
            //strss[i] = new String[str[i].length()];
            strss[i] = str[i].split(",");
        }

        for (String[] st : strss) {
            System.out.println(Arrays.toString(st));
        }
    }
}
