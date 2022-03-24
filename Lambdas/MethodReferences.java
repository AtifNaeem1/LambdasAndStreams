package com.company.Lambdas;

interface IMovie
{
    public boolean check(int id);
}
public class MethodReferences {

    //static method reference usage
    public void testMovieStaticMethodRef()
    {
        IMovie m1 = (i) -> i<100 ? true : false;  //without reference
        IMovie m2 = MethodReferences::isClassic;
    }

    //Instance method reference usage
    private void testMovieInstanceMethodRef()
    {
        MethodReferences ref = new MethodReferences();
        IMovie m1  = (i) -> i>10 && i<100 ? true:false;
        IMovie m2 = ref :: isTop10;
    }

    private void testMovieArbitraryObjectMethod()
    {
        IMovie m1 = SomeMethodReferences::isComedy;
    }

    public boolean isTop10(int movieId)
    {
        return true;
    }
    public static boolean isClassic(int movieId)
    {
        return true;
    }
}
class SomeMethodReferences
{
    public static boolean isComedy(int movieId)
    {
        return true;
    }
}
