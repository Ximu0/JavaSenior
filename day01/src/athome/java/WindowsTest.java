package athome.java;

/**
 *
 * 例子：创建三个窗口买票，总票数为100张。使用继承Thread类的方式
 *
 * 存在线程安全问题，待解决。
 *
 * @author wmsorigin
 * @create 2021-02-02 下午 4:26
 */

class Windows extends Thread{

    private static int ticket = 100;

    @Override
    public void run() {

        while(true){

            if(ticket > 0){
                System.out.println(getName() + ":" + "卖票，票号为：" + ticket);
                ticket--;
            }else{
                break;
            }

        }
    }
}

public class WindowsTest {
    public static void main(String[] args) {

        Windows w1 = new Windows();
        Windows w2 = new Windows();
        Windows w3 = new Windows();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}
