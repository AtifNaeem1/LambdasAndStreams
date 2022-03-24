package com.company.Functions;

import java.util.function.BiPredicate;

public class BiPredicateFunction {
    BiPredicate<Integer,Integer> ifFirstIsGreater = (i,j) -> i>j;

    private void check(int firstNumber,int secondNumber)
    {
        System.out.println(ifFirstIsGreater.test(firstNumber,secondNumber));
    }

    public static void main(String[] args) {
        new BiPredicateFunction().check(5,8);
    }
}
