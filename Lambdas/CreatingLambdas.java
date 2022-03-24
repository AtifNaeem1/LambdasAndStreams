package com.company.Lambdas;


// Given a visitor the program should return a output formally greeting the  visitor


public class CreatingLambdas {

    interface Greeting
    {
        public String sayHello(String username);
    }

    public void testGreeting(String username, Greeting greetingObject)
    {
        String result = greetingObject.sayHello(username);
        System.out.println("Result : " + result);
    }
    public static void main(String[] args) {
        Greeting greetingObject = username -> "Hello " + username;
        new CreatingLambdas().testGreeting("Naeem" , greetingObject);

        //       or

        new CreatingLambdas().testGreeting("Atif" ,
                username -> "Hello " + username);

        //      or

        new CreatingLambdas().testGreeting("Mohammad" ,
                (username) -> "Hello " + username);

        //      or

        new CreatingLambdas().testGreeting("Intern" ,
                (String username) -> "Hello " + username);
    }
}
