package 蓝桥杯省赛JavaB组2018;

/**
 * 标题：方格计数
 * <p>
 * 如图p1.png所示，在二维平面上有无数个1x1的小方格。
 * <p>
 * <p>
 * 我们以某个小方格的一个顶点为圆心画一个半径为1000的圆。
 * 你能计算出这个圆里有多少个完整的小方格吗？
 * <p>
 * 注意：需要提交的是一个整数，不要填写任何多余内容。
 *
 * @author wms
 * @create 2021-04-11-16:12
 */
public class B_方格计数 {

    public static void main(String[] args){
        int num=0,r=1000;
        for(int i=1;i<=1000;i++)//以第一象限为例，遍历方格的右上顶点
            for(int j=1;j<=1000;j++)
                if(i*i+j*j<=1000000)
                    num++;
        System.out.println(num*4);
    }
}

