package org.example.chapter01.functionalinterface;

@FunctionalInterface
public interface Myfunction
{
    String valueOf(Integer integer);

    static String hello(){
        return "hello";
    }
}
