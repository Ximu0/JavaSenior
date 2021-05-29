package _03;

/**
 * @author wms
 * @create 2021-04-27-16:57
 */
public class if_else {

    public static void main(String[] args) {

        //if-else使用说明
        //条件表达式必须是布尔表达式（关系表达式或逻辑表达式）、布尔变量
        //当多个条件是“互斥”关系时，条件判断语句及执行语句间顺序无所谓
        //当多个条件是“包含”关系时，“小上大下 / 子上父下”

        int score = 66;

        if(score > 90){
            System.out.println("优秀");
        } else if(score > 80){
            System.out.println("很棒");
        } else if(score > 70){
            System.out.println("还行");
        } else if(score > 60){
            System.out.println("万幸，及格了！");
        }


    }

}
