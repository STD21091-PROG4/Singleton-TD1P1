package com.singleton.demo.classes;

public class ClassSingleton {
    private static ClassSingleton instance;
    private String description;

    private ClassSingleton() {
        description = "Default description";
    }

    public static ClassSingleton getInstance() {
        if (instance == null) {
            instance = new ClassSingleton();
        }
        return instance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
