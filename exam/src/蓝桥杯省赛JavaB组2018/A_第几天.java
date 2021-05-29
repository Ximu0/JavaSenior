package 蓝桥杯省赛JavaB组2018;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 标题：第几天
 *
 * 2000年的1月1日，是那一年的第1天。
 * 那么，2000年的5月4日，是那一年的第几天？
 *
 *
 * 注意：需要提交的是一个整数，不要填写任何多余内容。
 * @author wms
 * @create 2021-04-11-14:26
 */
public class A_第几天 {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date date1 = sdf.parse("2000-01-01");
        Date date2 = sdf.parse("2000-05-04");

        long days = (date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24) + 1;

        System.out.println(days);

//        System.out.println(date1.getTime());
//        Date date = new Date(date1.getTime());
//        System.out.println(date);
    }

}
