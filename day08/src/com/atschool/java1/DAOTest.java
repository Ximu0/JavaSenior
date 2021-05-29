package com.atschool.java1;

import org.junit.Test;

import java.util.List;

/**
 * @author wms
 * @create 2021-04-07-12:56
 */
public class DAOTest {

    @Test
    public void test1(){

        CustomerDAO dao1 = new CustomerDAO();

        dao1.add(new Customer());
        List<Customer> list = dao1.getForList(10);


        StudentDAO dao2 = new StudentDAO();
        Student student = dao2.getIndex(1);
    }
}
