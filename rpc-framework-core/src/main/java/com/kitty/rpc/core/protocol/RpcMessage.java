package com.kitty.rpc.core.protocol;

import lombok.Data;

@Data
public class RpcMessage {

    /**
     * 请求头
     */
    private MessageHeader header;

    /**
     * 消息体
     */
    private Object body;
}
