package at.AIzhi.first;

/**
 * @author wms
 * @create 2021-04-15-18:55
 */
public class Test2 {
    public static void main(String[] args) {
        int[] rmonth = new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};
        int[] pmonth = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
        int year = 1921, month = 7, day = 23, sum = 0;
        while (true){
            if (month == 7 && year == 2020 && day == 1){
                break;
            }
            sum++;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                day++;
                if (day == rmonth[month]){
                    month++;
                    day = 1;
                }
                if (month == 13){
                    year++;
                    month = 1;
                }
            } else {
                day++;
                if (day == pmonth[month]){
                    month++;
                    day = 1;
                }
                if (month == 13){
                    year++;
                    month = 1;
                }
            }
        }

        System.out.println(sum * 24 * 60);

    }
}
