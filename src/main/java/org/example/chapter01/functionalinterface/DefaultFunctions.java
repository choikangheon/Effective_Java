package org.example.chapter01.functionalinterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DefaultFunctions {
    public static void main(String[] args) {
        /* Function
        첫번째 인수 인풋 , 두번쨰 아웃풋*/
        Function<Integer , String > intToString = (i) -> i.toString();
        /*Supplier 아웃풋만 있음
        * 인풋 없이 아웃풋만 있는것, 랜덤박스?*/
        Supplier<Integer> integerSupplier;
        /*COnsumer은 인풋은 있지만 아웃풋은 없음
        * ex ) System.out::println
        * */
        Consumer<Integer> integerConsumer;
        /*어떤 인자를 받아서 boolean을 리턴하는 함수*/
        Predicate<Integer> predicate;
    }
}
