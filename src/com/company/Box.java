package com.company;

public class Box <T>{
      private T type;

    public Box(T type) {
        this.type=type;
    }


    public static <T> Box<T>  genericbox(T type){
        return new Box<T>(type);
    }

    @Override
    public String toString() {
        return "Box{" +
                "type=" + type +
                '}';
    }
}
