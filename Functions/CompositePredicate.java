package com.company.Functions;

import java.util.Scanner;
import java.util.function.Predicate;

public class CompositePredicate {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Predicate<Integer> underAgeTest = i -> i>=18 ? true : false;
        Predicate<Integer> overAgeTest = i -> i<60  ? true : false;

        System.out.println("Enter your age");
        int age = keyboard.nextInt();


        Predicate<Integer> eligibilityTest = i -> i>=18 && i<60 ? true : false;

//        or

        Predicate<Integer> CompositePredicate = underAgeTest.and(overAgeTest);

        System.out.println(isEligible(underAgeTest,age) && isEligible(overAgeTest,age));

        System.out.println(isEligible(eligibilityTest,age));   //using composite predicate

    }
    private static boolean isEligible(Predicate<Integer> eligibilityTest, int age)
    {
        return eligibilityTest.test(age);
    }
}
