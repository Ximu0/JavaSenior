package at.AIzhi.first;

/**
 * @author wms
 * @create 2021-03-27-20:09
 */
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n;
        n=scan.nextInt();
        int max=0;
        int min=100;
        int sum=0;
        double average;
        int score[]=new int[n];
        for(int i=0;i<score.length;i++){
            score[i]=scan.nextInt();
        }
        for(int i=0;i<score.length;i++){
            if(score[i]>max){
                max=score[i];
            }
            if(score[i]<min){
                min=score[i];
            }
            sum+=score[i];
        }
        average=(double)sum/n;
        System.out.println(max);
        System.out.println(min);
        System.out.printf("%.2f",average);
    }
}