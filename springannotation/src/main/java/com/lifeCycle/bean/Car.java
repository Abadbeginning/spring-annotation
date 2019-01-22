package com.lifeCycle.bean;

public class Car {

    public Car() {
        System.out.println("bean 构造器。。。。");
    }

    public void init(){
        System.out.println("function begin init......");
    }

    public void destory(){
        System.out.println("function game over......");
    }

}
