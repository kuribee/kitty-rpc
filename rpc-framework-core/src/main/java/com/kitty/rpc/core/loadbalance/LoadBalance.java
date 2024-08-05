package com.kitty.rpc.core.loadbalance;


import com.kitty.rpc.core.common.RpcRequest;
import com.kitty.rpc.core.common.ServiceInfo;
import com.kitty.rpc.core.extension.SPI;

import java.util.List;

@SPI
public interface LoadBalance {
    /**
     * 负载均衡，从传入的服务列表中按照指定的策略返回一个
     *
     *
     */
    ServiceInfo select(List<ServiceInfo> invokers, RpcRequest request);
}
