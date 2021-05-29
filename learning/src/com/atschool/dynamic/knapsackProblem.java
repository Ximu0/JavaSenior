package com.atschool.dynamic;

/**
 * @author wms
 * @create 2021-04-14-19:04
 */
public class knapsackProblem {

    public static void main(String[] args){

        int[] weight = {1, 4, 3};//物品的重量
        int[] value = {1500, 3000, 2000};//物品的价值
        int m = 4;//背包的容量
        int n = value.length;//物品的个数

        //创建二维数组：
        //v[i][j] 表示在前 i 个物品中能够装入容量为 j 的背包中的最大价值
        int[][] v = new int[n + 1][m + 1];
        //为了记录放入商品的情况，我们定义一个二维数组
        int[][] path = new int[n + 1][m + 1];

        //初始化第一行和第一列
        for (int i = 0; i < v.length; i++) {
            v[i][0] = 0;//第一列设置为0
        }
        for (int i = 0; i < v[0].length; i++) {
            v[0][i] = 0;//第一行设置为0
        }

        //根据前面的公式来动态规划处理
        for (int i = 1; i < v.length; i++) {
            for (int j = 1; j < v[0].length; j++) {
                if (weight[i - 1] > j){
                    v[i][j] = v[i - 1][j];
                } else {
//                    v[i][j] = Math.max(v[i - 1][j], value[i - 1] + v[i - 1][j - weight[i - 1]]);
                    //为了记录商品存放到背包的情况，我们不能直接的使用上面的公式，需要使用if-else来体现公式
                    if (v[i - 1][j] < value[i - 1] + v[i - 1][j - weight[i - 1]]){
                        v[i][j] = value[i - 1] + v[i - 1][j - weight[i - 1]];
                        path[i][j] = 1;
                    }else {
                        v[i][j] = v[i - 1][j];
                    }
                }
            }
        }

        //输出一下v 看一下目前的情况
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[0].length; j++) {
                System.out.print(v[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("=================================");
        //输出最后我们是放入的哪些商品
        //遍历path，这样输出会把所有的放入情况都得到，其实我们只需要最后的放入
//        for (int i = 0; i < path.length; i++) {
//            for (int j = 0; j < path[0].length; j++) {
//                if (path[i][j] == 1){
//                    System.out.println("第" + i + "个商品放入到背包");
//                }
//            }
//        }

        //动脑筋
        int i = path.length - 1;//行的最大下标
        int j = path[0].length - 1;//列的最大下标
        while (i > 0 && j > 0){
            if (path[i][j] == 1){
                System.out.println("第" + i + "个商品放入到背包");
                j -= weight[i - 1];//w[i - 1]
            }
            i--;
        }
    }

}
