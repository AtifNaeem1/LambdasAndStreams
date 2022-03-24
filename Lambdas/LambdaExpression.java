package com.company.Lambdas;

interface Drawable{
    public void draw();
}
class WithoutLambda
{
    public void driver(int width) {

        //without lambda, Drawable implementation using anonymous class
        Drawable d = new Drawable() {
            public void draw() {
                System.out.println("Drawing " + width);
            }
        };
        d.draw();
    }
}
class WithLambda
{
    public void driver(int width) {

        //with lambda
        Drawable d2=()->{
            System.out.println("Drawing "+width);
        };
        d2.draw();
    }
}
public class LambdaExpression{
    public static void main(String[] args) {
        new WithoutLambda().driver(5);
        new WithLambda().driver(10);
    }
    }
