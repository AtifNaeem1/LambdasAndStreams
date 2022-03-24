package com.company.Functions;

import java.util.function.Function;

public class ComposingFunctions {
    Function<String,Integer> sayHello = name -> 100;
    Function<Integer,String> saveName = name -> "Saving your name " + name ;

    //andThen
    Function<String,String> greetAndSave = sayHello.andThen(saveName);

    //compose
    Function<Integer,Integer> saveAndGreet = sayHello.compose(saveName);

    //identity Function
    Function<String,String> identityFunction = Function.identity();

    private void dealNewCustomer(String name)
    {
        System.out.println(sayHello.apply(name));
        System.out.println(saveName.apply(100));

//        or

        System.out.println(greetAndSave.apply(name));

        System.out.println(saveAndGreet.apply(5));

        //Identity
        System.out.println(identityFunction.apply("Hello"));
    }

    public static void main(String[] args) {
        new ComposingFunctions().dealNewCustomer("Atif");
    }
}
