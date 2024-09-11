package com.kitty.rpc.core.codec;

interface BB{
    void print();
}

interface USB extends BB{
    int LENGTH=10;
    void print();
    default void read(){
        System.out.println("usb");
    }
}
abstract class Father{
    abstract void print();
    public void read(){
        System.out.println("father");
    }
}

class Computer extends Father implements USB {
    public void print(){

    }



}


public class TestInterface {
    public static void main(String[] args) {
        Computer c=new Computer();
        System.out.println(c.LENGTH);
        c.read();
    }
}
