package _03;

/**
 * @author wms
 * @create 2021-04-27-17:38
 */
public class break_continue_return {

    public static void main(String[] args) {

//        for (int i = 1; i <= 100; i++) {
//            if (i % 10 == 0){
//                continue;
//            }
//            System.out.println(i);
//        }
//
//        System.out.println("Say Hello!");

//        for (int i = 1; i <= 100; i++) {
//            if (i % 10 == 0){
//                break;
//            }
//            System.out.println(i);
//        }
//
//        System.out.println("Say Hello!");

        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0){
                return;
            }
            System.out.println(i);
        }

        System.out.println("Say Hello!");

    }

}
