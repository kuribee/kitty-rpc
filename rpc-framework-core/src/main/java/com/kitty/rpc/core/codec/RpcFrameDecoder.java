package com.kitty.rpc.core.codec;


import io.netty.handler.codec.LengthFieldBasedFrameDecoder;

/**
 * 粘包拆包编码器，使用固定长度的帧解码器，通过约定用定长字节表示接下来数据的长度。<p> 可以解决半包问题
 * 非共享，保存了 ByteBuf 的状态信息
 *
 */
public class RpcFrameDecoder extends LengthFieldBasedFrameDecoder{
    public RpcFrameDecoder() {
        this(1024, 12, 4);
    }
    public RpcFrameDecoder(int maxFrameLength, int lengthFieldOffset, int lengthFieldLength) {
        super(maxFrameLength, lengthFieldOffset, lengthFieldLength);
    }
}
