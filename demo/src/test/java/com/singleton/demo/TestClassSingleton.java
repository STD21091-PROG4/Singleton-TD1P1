package com.singleton.demo;

import com.singleton.demo.classes.ClassSingleton;

public class TestClassSingleton {
    public static void main(String[] args) {
        ClassSingleton singleton1 = ClassSingleton.getInstance();
        System.out.println("Description: " + singleton1.getDescription());

        singleton1.setDescription("Updated description");

        ClassSingleton singleton2 = ClassSingleton.getInstance();
        System.out.println("Description: " + singleton2.getDescription());
    }
}
