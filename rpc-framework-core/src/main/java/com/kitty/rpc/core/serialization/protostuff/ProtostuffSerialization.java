package com.kitty.rpc.core.serialization.protostuff;

import com.kitty.rpc.core.exception.SerializeException;
import com.kitty.rpc.core.serialization.Serialization;
import io.protostuff.LinkedBuffer;
import io.protostuff.ProtostuffIOUtil;
import io.protostuff.Schema;
import io.protostuff.runtime.RuntimePipeSchema;
import io.protostuff.runtime.RuntimeSchema;

/**
 * Protostuff 序列化算法实现类
 */
public class ProtostuffSerialization implements Serialization {

    private final LinkedBuffer BUFFER = LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE);

    @SuppressWarnings({"unchecked", "rawtypes"})
    @Override
    public <T> byte[] serialize(T object) {
        try{
            Schema schema= RuntimeSchema.getSchema(object.getClass());
            return ProtostuffIOUtil.toByteArray(object, schema, BUFFER);
        }catch (Exception e) {
            throw new SerializeException("Protostuff serialize failed.", e);
        } finally {
            // 重置 buffer
            BUFFER.clear();
        }
    }

    @Override
    public <T> T deserialize(Class<T> clazz, byte[] bytes) {
        try {
            Schema<T> schema = RuntimeSchema.getSchema(clazz);
            T object = schema.newMessage();
            ProtostuffIOUtil.mergeFrom(bytes, object, schema);
            return object;
        } catch (Exception e) {
            throw new SerializeException("Protostuff deserialize failed.", e);
        }
    }
}
