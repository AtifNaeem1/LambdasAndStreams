package com.company.Functions;

import java.util.function.Supplier;

public class SupplierFunction {
    Supplier<String[]> fruits = () -> new String[] {"Apple", "Banana" ,"orange"};

    public void supplierExample()
    {
        String[] fruitsList = fruits.get();

        for(String fruit : fruitsList)
        {
            System.out.println(fruit);
        }
    }

    public static void main(String[] args) {
        new SupplierFunction().supplierExample();
    }
}
