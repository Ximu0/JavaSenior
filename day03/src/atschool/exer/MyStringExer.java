package atschool.exer;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author wms
 * @create 2021-03-18-18:05
 */
/*
 * 1.模拟一个trim方法，去除字符串两端的空格。
 *
 * 2.将一个字符串进行反转。将字符串中指定部分进行反转。比如将“abcdefg”反转为”abfedcg”
 *
 * 3.获取一个字符串在另一个字符串中出现的次数。
      比如：获取“ab”在 “cdabkkcadkabkebfkabkskab”
      中出现的次数

4.获取两个字符串中最大相同子串。比如：
   str1 = "abcwerthelloyuiodef“;str2 = "cvhellobnm"//10
   提示：将短的那个串进行长度依次递减的子串与较长
   的串比较。

5.对字符串中字符进行自然顺序排序。"abcwerthelloyuiodef"
提示：
1）字符串变成字符数组。
2）对数组排序，选择，冒泡，Arrays.sort(str.toCharArray());
3）将排序后的数组变成字符串。

 */
public class MyStringExer {
    //1.模拟一个trim方法，去除字符串两端的空格。
    public String myTrim(String  str){
        if(str != null){
            int start = 0;
            int end = str.length() - 1;

            while (start < end && str.charAt(start) == ' '){
                start++;
            }

            while (start <  end && str.charAt(end) == ' '){
                end--;
            }

            if(str.charAt(start) == ' '){
                return "";
            }

            return str.substring(start,end + 1);
        }
        return null;
    }

    //2.将一个字符串进行反转。将字符串中指定部分进行反转。比如将“abcdefg”反转为”abfedcg”
    //方法一：使用char型数组进行反转
    public String reverse1(String str, int startIndex, int endIndex){
        if(str != null){
            char[]  charArray = str.toCharArray();

            for (int i = startIndex, j = endIndex; i < j; i++, j--) {
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
            }

            return new String(charArray);
        }
        return null;
    }

    //方法二：使用String的拼接
    public String reverse2(String str, int startIndex, int endIndex){
        if (str != null){
            //第一部分：
            String s = str.substring(0,startIndex);
            //第二部分：
            for (int i = endIndex; i >= startIndex; i--) {
                s += str.charAt(i);
            }
            //第三部分：
            s += str.substring(endIndex + 1);

            return s;
        }
        return null;
    }

    //方法三：使用StringBuilder、StringBuffer替换 String
    public String reverse3(String str, int startIndex, int endIndex){
        if(str != null){
            StringBuilder builder = new StringBuilder(str.length());
            //第一部分
            builder.append(str.substring(0,startIndex));
            //第二部分
            for (int i = endIndex; i >= startIndex; i--) {
                builder.append(str.charAt(i));
            }
            //第三部分
            builder.append(str.substring(endIndex + 1));

            return builder.toString();
        }
        return null;
    }

    @Test
    public void testReverse(){
        String str = "abcdefg";
        String reverse = reverse3(str, 2, 5);
        System.out.println(reverse);
    }

     /*
        第三题：
        获取一个字符串在另一个字符串中出现的次数。
        比如：获取“ab”在 “cdabkkcadkabkebfkabkskab”中出现的次数
    */

    public int getCount(String mainStr, String subStr){
        int count = 0;
        int index = 0;

        if(mainStr.length() >= subStr.length()){
            //方法一：
//            while((index = mainStr.indexOf(subStr)) != -1){
//                count++;
//                mainStr = mainStr.substring(index + subStr.length());
//            }

            //方法二：对方法一的改进
            while((index = mainStr.indexOf(subStr,index)) != -1){
                count++;
                index += subStr.length();
            }
            return count;
        }
        return 0;
    }
    @Test
    public void test2(){
        String mainStr = "cdabkkcadkabkebfkabkskab";
        String subStr = "ab";
        int count = getCount(mainStr, subStr);
        System.out.println(count);
    }

    //  第四题：获取两个字符串中最大相同子串。比如：
    //   str1 = "abcwerthelloyuiodef“;str2 = "cvhellobnm"//10
    //   提示：将短的那个串进行长度依次递减的子串与较长的串比较。

    //前提 ：两个字符串中只有一个最大相同子串
    public String getMaxSameString(String str1, String  str2){
        if(str1 != null && str2 != null){
            String  maxStr = (str1.length() >= str2.length() ? str1 : str2);
            String  minStr = (str1.length() < str2.length() ? str1 : str2);
            int length = minStr.length();

            for(int i = 0; i < length; i++){
                for(int x = 0, y = length - i; y < length; x++, y++){
                    String subStr = minStr.substring(x , y);
                    if(maxStr.contains(subStr)){
                        return subStr;
                    }
                }
            }
        }
        return null;
    }
    @Test
    public void test3(){
        String str1 = "abcwerthelloyuiodef";
        String str2 = "cvhellobnm";

        String maxSameString = getMaxSameString(str1, str2);
        System.out.println(maxSameString);
    }

    /*
    5.对字符串中字符进行自然顺序排序。"abcwerthelloyuiodef"
    提示：
    1）字符串变成字符数组。
    2）对数组排序，选择，冒泡，Arrays.sort(str.toCharArray());
    3）将排序后的数组变成字符串。
     */
    public String  sortString(String str){
        if(str != null){
            char[] chars = str.toCharArray();

            Arrays.sort(chars);

            return new String(chars);
        }
        return null;
    }
    @Test
    public void test4(){
        String str = "abcwerthelloyuiodef";
        String s = sortString(str);
        System.out.println(s);
    }


    public static void main(String[] args) {
        //测试问题1
        MyStringExer exer = new MyStringExer();
        String str = "  ab  c 123  ";
        String str1 = exer.myTrim(str);
        System.out.println(str1);
    }
}
