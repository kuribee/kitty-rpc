package com.kitty.rpc.core.enums;

import lombok.Getter;

/**
 * 消息类型枚举类
 */
public enum MessageType {
    /**
     * 类型 0 表示请求消息
     */
    REQUEST((byte) 0),

    /**
     * 类型 1 表示响应消息
     */
    RESPONSE((byte) 1),

    /**
     * 类型 2 表示心跳检查请求
     */
    HEARTBEAT_REQUEST((byte) 2),

    /**
     * 类型 3 表示心跳检查响应
     */
    HEARTBEAT_RESPONSE((byte) 3);

    @Getter
    private final byte type;

    MessageType(byte type) {
        this.type = type;
    }

    public static MessageType parseByType(byte type) throws IllegalArgumentException {
        for (MessageType messageType : MessageType.values()) {
            if (messageType.getType() == type) {
                return messageType;
            }
        }
        throw new IllegalArgumentException(String.format("The message type %s is illegal.", type));
    }
}
