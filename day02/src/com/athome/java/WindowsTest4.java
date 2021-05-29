package com.athome.java;

/**
 * 使用同步方法处理继承Thread类的方式中的线程安全问题
 *
 * @author wmsorigin
 * @create 2021-02-03 上午 10:11
 */
class Windows4 extends Thread {

    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {

            show();
        }
    }

    private static synchronized void show() {//同步监视器：Windows4.class
//    private synchronized void show() {//同步监视器：t1、t2、t3。此种解决方式是错误的。
        if (ticket > 0) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + ":" + "卖票，票号为：" + ticket);
            ticket--;
        }
    }
}

public class WindowsTest4 {
    public static void main(String[] args) {

        Windows4 w1 = new Windows4();
        Windows4 w2 = new Windows4();
        Windows4 w3 = new Windows4();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}
