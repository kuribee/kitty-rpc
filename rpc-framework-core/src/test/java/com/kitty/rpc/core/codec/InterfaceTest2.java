package com.kitty.rpc.core.codec;

interface A{
    int C=1;
    void print();
    public default void read(){
        System.out.println("A");
    }
}

interface B{
    int C=1;
    default void print(){

    }
    public default void read(){
        System.out.println("B");
    }
}

class sub implements A,B{

    @Override
    public void print() {

    }

    @Override
    public void read() {
        A.super.read();
    }
}

public class InterfaceTest2 {
}
