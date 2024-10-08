package com.kitty.rpc.client.transport;

import com.kitty.rpc.client.transport.http.HttpRpcClient;
import com.kitty.rpc.client.transport.netty.NettyRpcClient;
import com.kitty.rpc.client.transport.socket.SocketRpcClient;

/**
 * 获取指定传输通信协议的 Rpc 客户端实现类
 *
 * @version 1.0
 * @ClassName RpcClientFactory
 * @deprecated 当前类已被弃用，使用自定义 {@link com.kitty.rpc.core.extension.ExtensionLoader} 机制去动态加载 RpcClient 实现类
 */
@Deprecated
public class RpcClientFactory {

    /**
     * 根据指定的通信协议去生成对应的 RpcClient 实现类
     *
     * @param transport 指定的通信协议
     * @return 返回指定通信协议的 Rpc 客户端实现类
     */
    public static RpcClient getRpcClient(String transport) {
        switch (transport) {
            case "netty":
                return new NettyRpcClient();
            case "http":
                return new HttpRpcClient();
            case "socket":
                return new SocketRpcClient();
            default:
                throw new IllegalArgumentException(String.format("Transport communication protocol type %s is illegal.",
                        transport));
        }
    }

}
