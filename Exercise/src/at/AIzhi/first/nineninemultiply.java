package at.AIzhi.first;

/**
 * @author wms
 * @create 2021-03-24-23:50
 */
public class nineninemultiply {
    public static void main(String[] args) {

        for (int i = 1 ; i <= 9; i++) {
            for(int j = 1; j <= i; j++ ){
                System.out.print(j + " * " + i + " = " + i * j + '\t');
            }
            System.out.println();
        }

    }
}
