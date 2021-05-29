package at.school.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wms
 * @create 2021-03-29-19:41
 */
public class ListExer {
    /*
    区分List中remove(int index)和remove(Object obj)
     */
    @Test
    public void testListRemove() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);//
    }
    private static void updateList(List list) {
        list.remove(2);//删除了角标为2 的元素 ‘3’
        list.remove(new Integer(2));//删除了内容为‘2’的元素
    }
}
