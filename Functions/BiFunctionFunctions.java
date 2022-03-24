package com.company.Functions;

import java.util.function.BiFunction;

public class BiFunctionFunctions {
    BiFunction<Integer,Integer,Integer> sum = (i,j) -> i+j;

    private void sum(int firstNumber, int secondNumber)
    {
        System.out.println(sum.apply(firstNumber,secondNumber));
    }

    public static void main(String[] args) {
        new BiFunctionFunctions().sum(5,10);
    }
}
