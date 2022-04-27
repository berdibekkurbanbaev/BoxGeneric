package com.company;

public class Box <T>{
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public Box() {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "Box " +
                "value " + value ;
    }
    public static <T> Box method(Box box){
        return box;
    }
}
