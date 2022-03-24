package com.company.Functions;

import java.util.function.Consumer;

public class ConsumerFunction {
    Consumer<String> sayHello = name -> System.out.println("Hello " + name);
    Consumer<String> storeName = name -> System.out.println("Storing your name " + name);

    //or

    Consumer<String> sayHelloAndStore = sayHello.andThen(storeName);

    public void newCustomer(String name)
    {
        sayHello.accept(name);
        storeName.accept(name);

//        or

        sayHelloAndStore.accept(name);
    }

    public static void main(String[] args) {
        new ConsumerFunction().newCustomer("Atif");
    }
}
