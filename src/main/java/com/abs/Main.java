package com.abs;


public class Main {
    public static void main(String[] args) {

        Salaried s1 = new Salaried();
        System.out.println(s1);

        Salaried s2 = new Salaried();
        System.out.println(s2);
        System.out.println(s2.getSalary());

        Salaried s3 = new Salaried("alex",1000);
        System.out.println(s3);
        System.out.println(s3.getSalary());

        Hr h1 = new Hr("nikki",24000);
        System.out.println(h1);
        System.out.println(h1.getSalary());

    }
}