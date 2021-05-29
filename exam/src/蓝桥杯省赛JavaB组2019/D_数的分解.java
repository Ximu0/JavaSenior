package 蓝桥杯省赛JavaB组2019;

/**
 * 把2019 分解成3 个各不相同的正整数之和，并且要求每个正整数都不包
 * 含数字2 和4，一共有多少种不同的分解方法？
 * 注意交换3 个整数的顺序被视为同一种方法，例如1000+1001+18 和
 * 1001+1000+18 被视为同一种。
 * <p>
 * 解题思路：
 * 首先开辟一个2020的数组，用来标记每个数中是否包含2和4。通过这样的标记，可以在判断是可以直接返回，大大加快程序执行速度。
 *
 * @author wms
 * @create 2021-04-09-19:28
 */
public class D_数的分解 {
//    static int[] a = new int[2019 + 1];
//    public static void main(String[] args) {
//        int n = 2019;
//        //初始化处理1-2019的数字，如果数字标记为1，则有
//        for(int i = 1; i < a.length; i++) {
//            a[i] = 1;
//            char[] s = String.valueOf(i).toCharArray();
//            for(int b = 0; b < s.length; b++) {
//                if(s[b] == '2' || s[b] == '4') {
//                    a[i] = 0;
//                    break;
//                }
//            }
//        }
//        int cnt = 0;
//        for(int a = 1; a < n / 3 + 1; a++) {
//            if(check(a)) {
//                for(int b = a + 1; b < n; b++) {
//                    if(check(b)) {
//                        for(int c = b + 1; c < n; c++) {
//                            if(a + b + c > n) {
//                                break;
//                            }
//                            if(check(c)) {
//                                if(a + b + c == n) {
//                                    cnt++;
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(cnt);
//    }
//
//    //判断i中的数字是否有2 或者4
//    private static boolean check(int i) {
//        if(a[i] == 1) {
//            return true;
//        }else {
//            return false;
//        }
//    }
    //    //检查是不是带有2 或 4
//    static Boolean  check(int parm) {
//        while(parm>0) {
//            int t=parm%10;
//            if(t==2 || t==4) return true;
//            parm/=10;
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        int n=2019;
//        int sum=0;
//        //a<b<c
//        for (int a = 1; a <n; a++) {
//            for (int b = a+1; b < n&&n-a-b>b; b++) {
//                int c=n-a-b;//判断c是否包含2或者4
//                if(!check(a) &&!check(b) && !check(c)) {
//                    sum++;
//                }
//            }
//        }
//        System.out.println(sum);
//    }
    public static void main(String[] args) {
        int n = 2019;
        int sum = 0;
        int k;

//        char[] chars = String.valueOf(n).toCharArray();
//
//        for (int i = 0; i < chars.length; i++) {
//            System.out.println(chars[i]);
//        }

        /*
//        for (int i = 1; i <= n / 3; i++) {
//            if (isContains(i)){
//                continue;
//            }else{
//                for (int j = i; j <= n - i - j; j++) {
//                    if (isContains(j)){
//                        continue;
//                    }else{
//                        k = n - i - j;
//                        if (isContains(k)){
//                            break;
//                        }else{
//                            sum++;
//                        }
//                    }
//                }
//            }
//        }
//
//        System.out.println(sum);
*/

        long start = System.currentTimeMillis();

        for (int i = 1; i < n / 3; i++) {
            if (isContains(i)){
                for (int j = i + 1; j < n - i - j; j++) {
                    if (isContains(j)){
                        k = n - i - j;
                        if (isContains(k)){
                            sum++;
                        }
                    }
                }
            }
        }

        System.out.println(sum);

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static boolean isContains(int i){

        Boolean b = true;

        char[] chars = String.valueOf(i).toCharArray();
        for (int j = 0; j < chars.length; j++) {
            if (chars[j] == '2' || chars[j] == '4'){
                b = false;
            }
        }
        return b;
    }
}

