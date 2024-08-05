package com.kitty.rpc.core.serialization;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kitty.rpc.core.enums.SerializationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.Date;

/**
 * @author JerryYao
 * @version 1.0
 * @ClassName TestJsonSerialization
 * @Date 2023/1/6 16:03
 */
@Slf4j
public class TestJsonSerialization {

    public static void main(String[] args) {
        Serialization serialization = SerializationFactory.getSerialization(SerializationType.PROTOSTUFF);
        User user=new User("tom",new Date());
        byte[] serialize = serialization.serialize(user);
        log.debug("转化:{} ",serialization.deserialize(User.class, serialize));
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    static class User implements Serializable {
        private String username;

        private Date date;
    }
}
