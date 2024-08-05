package com.kitty.rpc.core.serialization;

import com.kitty.rpc.core.enums.SerializationType;

public class TestEnum {
    public static void main(String[] args) {
        for(SerializationType serializationType:SerializationType.values()){
            System.out.println(serializationType.getType());
        }
    }
}
