package com.company;

public class Box <T>{
    T type;

    public static <T> Box<T>  box(Box box){
        return new Box<T>();
    }
}
