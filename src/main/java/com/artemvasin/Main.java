package com.artemvasin;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Products pr1=context.getBean("myPr1", Products.class);
        Products pr2=context.getBean("myPr2", Products.class);
        Products pr3=context.getBean("myPr3", Products.class);

       // System.out.println(shop);
        System.out.println("Dobavlen tovar v magazin: " + pr1);
        System.out.println("Dobavlen tovar v magazin: " + pr2);
        System.out.println("Dobavlen tovar v magazin: " + pr3);
        List <Products> shop=new ArrayList<>();
        shop.add(pr1);
        shop.add(pr2);
        shop.add(pr3);
        System.out.println("Spisok tovarov v magazine: " + shop);
        summaProductov(pr1.getWeight(),pr2.getWeight(),pr3.getWeight());

    }
    public static void summaProductov(int a, int b,int c) {
        double x= a+b+c;
        System.out.println(x);
    }
}
