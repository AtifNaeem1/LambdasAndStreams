package com.company.Lambdas;

interface Sumable{
    int add(int a,int b);
}


public class LambdaWithReturnType {
    public static void main(String[] args) {

        // Lambda expression without return keyword.
        Sumable ad1=(a,b)->(a+b);
        System.out.println(ad1.add(10,20));

        // Lambda expression with return keyword.
        Sumable ad2=(int a,int b)->{
            return (a+b);
        };
        System.out.println(ad2.add(100,200));
    }
}
