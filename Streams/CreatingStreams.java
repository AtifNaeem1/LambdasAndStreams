package com.company.Streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingStreams {

    //from collections
    private void testCollectionStreams()
    {

    }

    //Empty Streams
    private void testEmptyStreams()
    {
        Stream<Integer> integerEmptyStream = Stream.empty();
        System.out.println("Empty stream: " + integerEmptyStream.count());
    }

    //from values/arrays
    private void testStreamsFromValues()
    {
        Stream<String> movieNames = Stream.of("Avtar","Tin Tin","Jurassic Park");
        movieNames.forEach(System.out::println);

        String[] movieNames2 = {"Avtar","Tin Tin","Jurassic Park"};
        Stream<String> mNames2 = Stream.of(movieNames2);
        System.out.println(mNames2);


    }



    private void testGenerateIterateStreams()
    {
        Stream<Double> randomStream = Stream.generate(Math::random);
        randomStream.forEach(System.out::println);

        //iterate
        Stream<Integer> wholeNumbers = Stream.iterate(1,i->i+1);
        wholeNumbers.forEach(System.out::println);
    }
}
