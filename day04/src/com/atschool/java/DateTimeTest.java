package com.atschool.java;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * jdk 8之前的日期时间的API测试
 * 1. System类中 currentTimeMillis();
 * 2. java.util.Date和子类java.sql.Date
 * 3. SimpleDateFormat
 * 4. Calendar
 *
 * @author wms
 * @create 2021-03-19-15:56
 */
public class DateTimeTest {
    /*
    SimpleDateFormat的使用：SimpleDateFormat对日期Date类的格式化和解析

    1.两个操作：
    1.1 格式化： 日期 ---> 字符串
    1.2 解析： 格式化的逆过程，字符串 ---> 日期

    2.SimpleDateFormat的实例化

     */

    @Test
    public void testSimpleDateFormat() throws ParseException {
        //实例化SimpleDateFormat:使用默认的构造器
        SimpleDateFormat sdf = new SimpleDateFormat();

        //格式化：日期 ---> 字符串
        Date date = new Date();
        System.out.println(date);//Sat Mar 20 14:30:20 CST 2021

        String format = sdf.format(date);
        System.out.println(format);//2021/3/20 下午2:30

        //解析：格式化的逆过程，字符串 ---> 日期
        String str = "2021/3/19 下午4:05";
        Date date1 = sdf.parse(str);
        System.out.println(date1);//Fri Mar 19 16:05:00 CST 2021

        //******************按照指定的方式格式化和解析：调用带参的构造器************************
        //hh十二小时制，HH二十四小时制
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //格式化
        String format1 = sdf1.format(date);
        System.out.println(format1);//2021-03-20 02:30:20
        //解析:要求字符串必须是符合SimpleDateFormat识别的格式(通过构造器参数体现),否则，抛异常
        Date date2 = sdf1.parse(format1);
        System.out.println(date2);//Sat Mar 20 02:30:20 CST 2021
    }

    /*
    练习一：字符串"2020-09-08"转换为java.sql.Date

    练习二：“三天打鱼两天晒网”  1990-01-01  xxxx-xx-xx 打鱼？ 晒网？

    举例： 2020-09-08 ？ 总天数

    总天数  % 5 == 1 2 3 ：打渔
    总天数  % 5 == 4 0 ：晒网

    总天数计算？
    方式一：(date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24) + 1
    方式二：1990-01-01 --> 2019-12-31 + 2020-01-01 --> 2020-09-08
     */
    @Test
    public void test1() throws ParseException {
        String birth = "2020-09-08";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date date = sdf.parse(birth);
//        System.out.println(date);//Tue Sep 08 00:00:00 CST 2020
//        System.out.println(date.getTime());//1599494400000

        java.sql.Date birthDate = new java.sql.Date(date.getTime());
        System.out.println(birthDate);//2020-09-08
    }
    @Test
    public void test2() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date date1 = sdf.parse("1990-01-01");
        Date date2 = sdf.parse("2020-09-08");

//        System.out.println(date1.getTime());
//        System.out.println(date2.getTime());
        long dayTotal = (date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24) + 1;
        long day = dayTotal % 5;
        if (day == 1 || day == 2 || day == 3){
            System.out.println("打渔");
        }else if(day == 4 ||  day == 0){
            System.out.println("晒网");
        }else{
            System.out.println("!!!!!!");
        }
    }

    /*
    Calendar 日历类(抽象类)的使用

     */
    @Test
    public void testCalendar(){
        //1.实例化
        //方式一：创建其子类（GregorianCalendar）的对象
        //方式二：调用其静态方法getInstance()
        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.getClass());//class java.util.GregorianCalendar

        //常用方法：
        //get()
        int days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

        //set()
        //calendar可变性
        calendar.set(Calendar.DAY_OF_MONTH,22);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        //add()
        calendar.add(Calendar.DAY_OF_MONTH,-2);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        //getTime()
        Date date = calendar.getTime();
        System.out.println(date);

        //setTime()
        Date date1 = new Date();
        System.out.println(date1);
        calendar.setTime(date1);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

    }
}
