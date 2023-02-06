package org.example;

import java.time.LocalDateTime;

public class AnimalFood {
    String name;
    int price;
    int quantity;
    java.util.Calendar expireDate;
    boolean availability;

    public AnimalFood(String name, int price, int quantity,java.util.Calendar expireDate) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expireDate= expireDate;
    }
}
