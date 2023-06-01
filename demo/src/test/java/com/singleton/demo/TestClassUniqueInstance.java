package com.singleton.demo;

import com.singleton.demo.classes.ClassUniqueInstance;

public class TestClassUniqueInstance {
    public static void main(String[] args) {
        ClassUniqueInstance instance1 = ClassUniqueInstance.getInstance();
        System.out.println("enum: " + instance1.getClick());

        instance1.setClick(5);

        ClassUniqueInstance instance2 = ClassUniqueInstance.getInstance();
        System.out.println("enum: " + instance2.getClick());
    }
}
