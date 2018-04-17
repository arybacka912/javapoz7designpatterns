package com.sda.factory.animals.cat;

public class PersianCat implements Cat {
    @Override
    public void sleep() {
        System.out.println("Sleeping on roof");
    }

    @Override
    public void eat() {
        System.out.println("Eating mouse");
    }
}
