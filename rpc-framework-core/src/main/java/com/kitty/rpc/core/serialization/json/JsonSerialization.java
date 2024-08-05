package com.kitty.rpc.core.serialization.json;

import com.google.gson.*;
import com.kitty.rpc.core.exception.SerializeException;
import com.kitty.rpc.core.serialization.Serialization;
import lombok.SneakyThrows;

import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
/**
 * 基于Gson库实现的JSON序列化算法
 */
public class JsonSerialization implements Serialization {
    @Override
    public <T> byte[] serialize(T object) {
        try{
            Gson gson=new GsonBuilder().registerTypeAdapter(Class.class,new ClassCodec()).create();
            String json=gson.toJson(object);
            return json.getBytes(StandardCharsets.UTF_8);
        }catch (Exception e){
            throw new SerializeException("Json serialize failed.", e);
        }
    }

    @Override
    public <T> T deserialize(Class<T> clazz, byte[] bytes) {
        try{
            Gson gson = new GsonBuilder().registerTypeAdapter(Class.class, new ClassCodec()).create();
            String json = new String(bytes, StandardCharsets.UTF_8);
            return gson.fromJson(json, clazz);
        }catch (JsonSyntaxException e) {
            throw new SerializeException("Json deserialize failed.", e);
        }
    }

    /**
     * 自定义JavaClass对象序列化，解决Gson无法序列化Class信息
     */
    static class ClassCodec implements JsonSerializer<Class<?>>,JsonDeserializer<Class<?>>{


        @Override
        public JsonElement serialize(Class<?> src, Type typeOfSrc, JsonSerializationContext context) {
            return new JsonPrimitive(src.getName());
        }

        @SneakyThrows
        @Override
        public Class<?> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            String name=json.getAsString();
            return Class.forName(name);
        }
    }
}
