package com.kitty.rpc.provider.service.impl;

import com.kitty.rpc.api.service.HelloService;
import com.kitty.rpc.server.annotation.RpcService;

@RpcService(interfaceClass = HelloService.class)
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
