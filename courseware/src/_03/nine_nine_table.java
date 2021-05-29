package _03;

/**
 * @author wms
 * @create 2021-04-27-17:41
 */
public class nine_nine_table {

    public static void main(String[] args) {
        //打印九九乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + i*j +'\t');
            }
            System.out.println();
        }
    }
}
