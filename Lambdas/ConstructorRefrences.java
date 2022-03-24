package com.company.Lambdas;

public class ConstructorRefrences {
    class Movie{
        public Movie(int id)
        {

        }
        public Movie(int d, String name) {

        }

    }
    interface MovieFactory
    {
        public Movie create(int id);
    }
    MovieFactory m1 = i -> new Movie(i);
    MovieFactory m2 = Movie::new;

    interface MovieFactory2
    {
        public Movie create(int id, String s);
    }

    MovieFactory2 m3 = Movie::new;
}
