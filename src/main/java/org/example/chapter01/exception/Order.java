package org.example.chapter01.exception;

import java.time.LocalDate;

public class Order {
    public void updateDeliverDate(LocalDate deliverDate){
        if (deliverDate.isBefore(LocalDate.now())){
            //TODO 과거로 배송...?
            throw  new IllegalArgumentException("deliverDate can't be earlier than " + LocalDate.now());
        }
    }
}
