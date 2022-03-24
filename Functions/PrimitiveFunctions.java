package com.company.Functions;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;

public class PrimitiveFunctions {
    Function<Integer, String> hello = i -> "Hello";

    //for primitive type
    IntFunction<String> hello2 = i -> "hello" ;

    //if both are primitives
    Function<Integer,Double> intToDouble = i -> (double)i;

    //primitive way
    IntToDoubleFunction intToDouble2 = i -> (double)i;
}
