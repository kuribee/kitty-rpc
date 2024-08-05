package com.kitty.rpc.core.constant;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 协议常量类
 */
public class ProtocolConstants {
    private static final AtomicInteger ai=new AtomicInteger();

    public static final byte[] MAGIC_NUM=new byte[]{(byte) 'k', (byte) 'r', (byte) 'p', (byte) 'c'};

    public static final byte VERSION = 1;

    public static final String PING = "ping";

    public static final String PONG = "pong";

    public static int getSequenceId() {
        // 实现原子操作
        return ai.getAndIncrement();
    }
}
