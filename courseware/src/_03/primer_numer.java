package _03;

/**
 * @author wms
 * @create 2021-04-27-17:45
 */
public class primer_numer {

    public static void main(String[] args) {

        //查找100以内的质数
        for (int i = 2; i <= 100; i++) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println(i);
            }
        }

    }

}
