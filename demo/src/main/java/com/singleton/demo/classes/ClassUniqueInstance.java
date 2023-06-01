package com.singleton.demo.classes;

public class ClassUniqueInstance {
    private static ClassUniqueInstance instance = new ClassUniqueInstance();

    private int click;

    private ClassUniqueInstance() {
        click = 0;
    }

    public static ClassUniqueInstance getInstance() {
        return instance;
    }

    public int getClick() {
        return click;
    }

    public void setClick(int click) {
        this.click = click;
    }
}
