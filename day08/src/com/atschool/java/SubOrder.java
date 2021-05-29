package com.atschool.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wms
 * @create 2021-04-06-19:51
 */
public class SubOrder extends Order<Integer>{//SubOrder:不是泛型类
    public static <E> List<E> copyFromArrayToList(E[] arr){

        ArrayList<E> list = new ArrayList<>();

        for(E e : arr){
            list.add(e);
        }

        return list;
    }
}
