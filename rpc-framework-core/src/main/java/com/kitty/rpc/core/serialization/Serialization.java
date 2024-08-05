package com.kitty.rpc.core.serialization;

import com.kitty.rpc.core.extension.SPI;

@SPI
public interface Serialization {
    /**
     * 将传入对象进行序列化
     */
    <T> byte[] serialize(T object);

    /**
     * 将对象进行反序列化
     */
    <T> T deserialize(Class<T> clazz,byte[] bytes);
}
