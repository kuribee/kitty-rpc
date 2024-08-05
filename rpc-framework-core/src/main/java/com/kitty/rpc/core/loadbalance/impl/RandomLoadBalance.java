package com.kitty.rpc.core.loadbalance.impl;


import com.kitty.rpc.core.common.RpcRequest;
import com.kitty.rpc.core.common.ServiceInfo;
import com.kitty.rpc.core.loadbalance.AbstractLoadBalance;

import java.util.List;
import java.util.Random;

/**
 * 随机负载均衡策略实现类
 *
 */
public class RandomLoadBalance extends AbstractLoadBalance {

    final Random random = new Random();

    @Override
    protected ServiceInfo doSelect(List<ServiceInfo> invokers, RpcRequest request) {
        return invokers.get(random.nextInt(invokers.size()));
    }
}
