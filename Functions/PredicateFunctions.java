package com.company.Functions;


import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateFunctions {


    public static void main(String[] args) {
        //Predicate<Integer> eligibilityTest = i -> i>=18 ? true : false;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = keyboard.nextInt();
        isEligible(i -> i>=18 ? true : false , age);

    }
    private static void isEligible(Predicate<Integer> eligibilityTest, int age)
    {
        System.out.println(eligibilityTest.test(age));
    }
}
