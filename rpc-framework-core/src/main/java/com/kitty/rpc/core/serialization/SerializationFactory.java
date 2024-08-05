package com.kitty.rpc.core.serialization;

import com.kitty.rpc.core.enums.SerializationType;
import com.kitty.rpc.core.serialization.hessian.HessianSerialization;
import com.kitty.rpc.core.serialization.jdk.JdkSerialization;
import com.kitty.rpc.core.serialization.json.JsonSerialization;
import com.kitty.rpc.core.serialization.kryo.KryoSerialization;
import com.kitty.rpc.core.serialization.protostuff.ProtostuffSerialization;

/**
 * 序列化算法工厂，通过序列化枚举类型获取相应的序列化算法实例
 */
public class SerializationFactory {
    public static Serialization getSerialization(SerializationType enumType){
        switch (enumType) {
            case JDK:
                return new JdkSerialization();
            case JSON:
                return new JsonSerialization();
            case HESSIAN:
                return new HessianSerialization();
            case KRYO:
                return new KryoSerialization();
            case PROTOSTUFF:
                return new ProtostuffSerialization();
            default:
                throw new IllegalArgumentException(String.format("The serialization type %s is illegal.",
                        enumType.name()));
        }
    }
}
