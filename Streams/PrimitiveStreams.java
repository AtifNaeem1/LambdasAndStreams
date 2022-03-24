package com.company.Streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreams {

    private void intStream()
    {
        int[] integers = new int[] { 2,4,6,5,8};

        IntStream intStream = IntStream.of(integers);
        intStream.forEach(System.out::println);

        IntStream intStream2 = IntStream.of(2,4,6,5,8);
        intStream2.forEach(System.out::println);

    }

    private void doubleStream()
    {
        double[] doublesArray = new double[] {2.4, 4.2, 6.3, 8.5};

        DoubleStream doubleStream = DoubleStream.of(doublesArray);
        doubleStream.forEach(System.out::println);

        DoubleStream doubleStream1 = DoubleStream.of(2.4, 4.2, 6.3, 8.5);
        doubleStream1.forEach(System.out::println);
    }

    private void convertStreams()
    {
        Stream<Integer> integerClassStream = Stream.of(2,4,6,5,8);
        IntStream integerPrimitiveStream = integerClassStream.mapToInt(Integer::intValue);
        integerPrimitiveStream.forEach(System.out::println);
    }

    public static void main(String[] args) {
        new PrimitiveStreams().intStream();
        new PrimitiveStreams().doubleStream();
        new PrimitiveStreams().convertStreams();
    }
}
