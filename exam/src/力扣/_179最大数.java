package 力扣;

import java.util.Arrays;

/**
 * [999999991,9]
 * @author wms
 * @create 2021-04-12-19:29
 */
public class _179最大数 {

    public static void main(String[] args) {


        int[] arr = new int[]{999999991,9};

        System.out.println(largestNumber(arr));

    }

    //自己答案：执行用时：
    //42 ms, 在所有 Java 提交中击败了5.16%的用户
    // 内存消耗：38.4 MB, 在所有 Java 提交中击败了15.86%的用户
//    public static String largestNumber(int[] nums) {
//        String str = new String();
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length ; j++) {
//                if (Long.parseLong(String.valueOf(nums[i]) + String.valueOf(nums[j])) <
//                        Long.parseLong(String.valueOf(nums[j]) + String.valueOf(nums[i]))){
//                    int temp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = temp;
//                }
//            }
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            str += String.valueOf(nums[i]);
//        }
//
//        if (nums[0] == 0){
//            return "0";
//        }else{
//            return str;
//        }
//    }


    //官方答案
    /*
    执行用时：4 ms, 在所有 Java 提交中击败了99.50%的用户
    内存消耗：36.6 MB, 在所有 Java 提交中击败了99.53%的用户
     */
    public static String largestNumber(int[] nums) {
        int n = nums.length;
        // 转换成包装类型，以便传入 Comparator 对象（此处为 lambda 表达式）
        Integer[] numsArr = new Integer[n];
        for (int i = 0; i < n; i++) {
            numsArr[i] = nums[i];
        }

        Arrays.sort(numsArr, (x, y) -> {
            long sx = 10, sy = 10;
            while (sx <= x) {
                sx *= 10;
            }
            while (sy <= y) {
                sy *= 10;
            }
            return (int) (-sy * x - y + sx * y + x);
        });

        if (numsArr[0] == 0) {
            return "0";
        }
        StringBuilder ret = new StringBuilder();
        for (int num : numsArr) {
            ret.append(num);
        }
        return ret.toString();
    }


    
}
