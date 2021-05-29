package com.atschool.exer;

/**
 * @author wms
 * @create 2021-03-16-18:01
 */
public class StringTest {
    String str = new String("good");
    char[] ch = {'t', 'e', 's', 't'};

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'b';
    }

    public static void main(String[] args) {
        StringTest ex = new StringTest();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str);//good  字符串的不可变性
        System.out.println(ex.ch);//best
    }
}
