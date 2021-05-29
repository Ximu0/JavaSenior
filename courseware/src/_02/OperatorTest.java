package _02;

/**
 * @author wms
 * @create 2021-04-13-16:17
 */
public class OperatorTest {
    public static void main(String[] args) {
        //自增自减运算符
//        int i1 = 10;
//        int i2 = 20;
//        int i = i1++;
//        System.out.print("i=" + i);//10
//        System.out.println("i1=" + i1);//11
//        i = ++i1;
//        System.out.print("i=" + i);//12
//        System.out.println("i1=" + i1);//12
//        i = i2--;
//        System.out.print("i=" + i);//20
//        System.out.println("i2=" + i2);//19
//        i = --i2;
//        System.out.print("i=" + i);//18
//        System.out.println("i2=" + i2);//18
//
//        int i;
//        int i3 = 10;
//        ++i3;//i3++
//        i = i3;
//        System.out.println(i);

        //注意点：
//        short s1 = 10;
////        s1 = s1 + 1;//编译失败
////        s1 = (short) (s1 + 1);//正确的
//        s1++;//自增1不会改变本身变量的数据类型
//        System.out.println(s1);
                /*
        //开发中：如果希望变量实现+2 的操作，
        有几种方法（前提：int num = 10;）
        //方式一：num = num + 2;
        //方式二：num += 2;(推荐:原因：不会改变变量 本身的数据类型)

         //开发中：如果希望变量实现+1 的操作，
         有几种方法（前提：int num = 10;）
        //方式一：num = num + 1;
        //方式二：num += 1;
        //方式三：num++;(推荐)
         */
//        short s1 = 10;
////        s1 = s1 + 2;//编译失败
//        s1 += 2;//不会改变变量本身的数据类型
//        System.out.println(s1);

//        int i = 1;
//        i *= 0.1;
//        System.out.println(i);//0
//        i++;
//        System.out.println(i);//1

//        int m = 2;
//        int n = 3;
//        n *= m++;
//        System.out.println("m=" + m);//3
//        System.out.println("n=" + n);//6
////
//        int n = 10;
//        n += (n++) + (++n);//n = n + n++ + ++n : 10 + 10 + 12
//        System.out.println(n);//32


        int a;
        //除号：/
//        int num1 = 12;
//        int num2 = 5;
//
//        int result1 = num1 / num2;
//        System.out.println(result1);//2
//
//        int result2 = num1 / num2 * num2;
//        System.out.println(result2);//10
//
//        double result3 = num1 / num2;
//        System.out.println(result3);//2.0
//
//        double result4 = num1 / num2 + 0.0;
//        System.out.println(result4);//2.0
//
//        double result5 = num1 / (num2 + 0.0);
//        System.out.println(result5);//2.4
//
//        double result6 = (double) num1 / num2;
//        System.out.println(result6);//2.4
//
//        double result7 = (double) (num1 / num2);
//        System.out.println(result7);//2.0


        int b;
        //取余：%
        /*
        //结论：结果的符号与被模数的符号相同
        //开发中，经常使用%来判断能否被除尽
         */
//        int m1 = 12;
//        int n1 = 5;
//        System.out.println("m1 % n1 =" + m1 % n1);//2
//
//        int m2 = -12;
//        int n2 = 5;
//        System.out.println("m2 % n2 =" + m2 % n2);//-2
//
//        int m3 = 12;
//        int n3 = -5;
//        System.out.println("m3 % n3 =" + m3 % n3);//2
//
//        int m4 = -12;
//        int n4 = -5;
//        System.out.println("m4 % n4 =" + m4 % n4);//-2

        int c;
        //打印百位、十位、个位

//    随意给出一个整数，打印显示它的个位数，十位数，百位数的值。
//    格式如下：
//    数字xxx的情况如下：
//    个位数：
//    十位数：
//    百位数：
//    例如：
//    数字153的情况如下：
//    个位数：3
//    十位数：5
//    百位数：1
//     */
//        Scanner scan = new Scanner(System.in);
//
//        int i = scan.nextInt();
//
//        int ge = i % 10;
//        int shi = i % 100 / 10;
//        int bai = i / 100;
//
//        System.out.println("数字" + i + "的情况如下：");
//        System.out.println("个位数：" + ge);
//        System.out.println("十位数：" + shi);
//        System.out.println("百位数：" + bai);

        /*
        逻辑运算符
         */
        /*
        区分& 和 &&
        相同点1：& 和 && 的运算结果相同
        相同点2：当符号左边是true时，二者都会执行符号右边的运算
        不同点：当符号左边是false时，&继续执行符号右边的运算。&&不再执行符号右边的运算。
        开发中，推荐使用&&
         */
//        boolean b1 = true;
//        b1 = false;
//        int num1 = 10;
//        if (b1 & (num1++ > 0)){
//            System.out.println("我现在在北京");
//        }else{
//            System.out.println("我现在在南京");
//        }
//        System.out.println(num1);
////
//        boolean b2 = true;
//        b2 = false;
//        int num2 = 10;
//        if (b1 && (num2++ > 0)){
//            System.out.println("我现在在北京");
//        }else{
//            System.out.println("我现在在南京");
//        }
//        System.out.println(num2);
        /*
        区分| 和 ||
         */
        /*
        相同点1：| 和 || 的运算结果相同
        相同点2：当符号左边是false时，二者都会执行符号右边的运算
        不同点：当符号左边是true时，|继续执行符号右边的运算。||不再执行符号右边的运算。
        开发中，推荐使用||
         */
//        boolean b1 = false;
////        b1 = true;
//        int num1 = 10;
//        if (b1 | (num1++ > 0)){
//            System.out.println("我现在在北京");
//        }else{
//            System.out.println("我现在在南京");
//        }
//        System.out.println(num1);
//
//        boolean b2 = false;
////        b2 = true;
//        int num2 = 10;
//        if (b1 || (num2++ > 0)){
//            System.out.println("我现在在北京");
//        }else{
//            System.out.println("我现在在南京");
//        }
//        System.out.println(num2);

        /*
        逻辑运算符练习题：
         */
        //1.
//        int x = 1;
//        int y=1;
//        if(x++==2 & ++y==2){
//            x =7;
//        }
//        System.out.println("x="+x+",y="+y);

//        //2.
//        int x = 1, y = 1;
//        if (x++ == 2 && ++y == 2) {
//            x = 7;
//        }
//        System.out.println("x=" + x + ",y=" + y);//2,1

        //3
//        int x = 1,y = 1;
//        if(x++==1 | ++y==1){
//            x =7;
//        }
//        System.out.println("x="+x+",y="+y);//7,2

        //4
//        int x = 1,y = 1;
//        if(x++==1 || ++y==1){
//            x =7;
//        }
//        System.out.println("x="+x+",y="+y);//7,1

    }

}
