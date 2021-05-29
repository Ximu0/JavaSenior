package com.athome.java;

/**
 * 使用同步代码块解决继承Thread类的方式的线程安全问题
 * <p>
 * 例子：创建三个窗口买票，总票数为100张。使用继承Thread类的方式
 * <p>
 * 说明：在继承Thread类创建多线程的方式中，慎用this充当同步监视器，考虑使用当前类充当同步监视器。
 *
 * @author wmsorigin
 * @create 2021-02-02 下午 4:26
 */

class Windows2 extends Thread {

    private static int ticket = 100;
    private static Object obj = new Object();

    @Override
    public void run() {

        while (true) {

            //正确的
//            synchronized (obj){
            synchronized (Windows2.class) {//Windows2.class只会加载一次
                //错误的方式：this代表着t1,t2,t3三个对象
//            synchronized(this){
                if (ticket > 0) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(getName() + ":" + "卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }

        }
    }
}

public class WindowsTest2 {
    public static void main(String[] args) {

        Windows2 w1 = new Windows2();
        Windows2 w2 = new Windows2();
        Windows2 w3 = new Windows2();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}