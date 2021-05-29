package com.atschool.java3;

import org.junit.Test;

import java.io.File;

/**
 * File类的使用
 *
 * 1.File类的一个对象，代表一个文件或一个文件目录（俗称：文件夹）
 * 2.File类声明在java.io包下
 *
 * @author wms
 * @create 2021-05-28-14:51
 */
public class FileTest {
    /*
    1.如何创建File类的实例
        File(String filePath)
        File(String parentPath,String childPath)
        File(File parentFile,String childPath)

    2.
    相对路径：相较于某个路径下，指明的路径。
    绝对路径：包含盘符在内的文件或文件目录的路径。

    3.路径分隔符
    windows:\\
    unix:/
     */
    @Test
    public void test1(){
        //构造器1
        File file1 = new File("hello.txt");//相对于当前module
        File file2 = new File("D:\\IDEA_WorkSpace\\JavaSenior\\day08\\he.txt");

        System.out.println(file1);
        System.out.println(file2);

        //构造器2
        File file3 = new File("D:\\IDEA_WorkSpace","JavaSenior");
        System.out.println(file3);

        //构造器4
        File file4 = new File("file3","he.txt");
        System.out.println(file4);

        //测试git
        System.out.println("Hello Git1!");
        System.out.println("Hello Git2!");
        System.out.println("Hello Git3!");
        System.out.println("Hello Git4!");
    }
}
