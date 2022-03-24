package com.company.Functions;

import java.util.function.BiConsumer;


public class BiConsumerFunction {
    BiConsumer<Integer,Integer> ifFirstIsGreater = (i, j) -> System.out.println("Received "+i+" & "+j);

    private void check(int firstNumber,int secondNumber)
    {
        ifFirstIsGreater.accept(firstNumber,secondNumber);
    }

    public static void main(String[] args) {
        new BiConsumerFunction().check(5,8);
    }
}
