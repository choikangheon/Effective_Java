package org.example.chapter01.item03;

public interface HelloService {

    String hello();

    static private void
    prepareMessage(){}
    default String hi(){
        prepareMessage();
        return "hi";
    }

    default String hi2(){
        prepareMessage();
        return "hi";
    }
    default String hi3(){
        prepareMessage();
        return "hi";
    }
    default String hi4(){
        prepareMessage();
        return "hi";
    }

}
