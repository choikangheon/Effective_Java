package org.example.chapter01.varargs;

import java.util.Arrays;

public class VarargsSamples {

    public void printNumbers(int... numbers){
        System.out.println(numbers.getClass().getCanonicalName());
        System.out.println(numbers.getClass().getComponentType());
        Arrays.stream(numbers).forEach(System.out::println);
    }

    public static void main(String[] args) {
        VarargsSamples samples = new VarargsSamples();
        samples.printNumbers(5,10);
    }
}
