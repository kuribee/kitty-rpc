package com.kitty.rpc.provider.service.impl;

import com.kitty.rpc.api.service.AbstractService;
import com.kitty.rpc.server.annotation.RpcService;

/**
 * @version 1.0
 * @ClassName AbstractServiceImpl
 */
@RpcService(interfaceClass = AbstractService.class)
public class AbstractServiceImpl extends AbstractService {
    @Override
    public String abstractHello(String name) {
        return "abstract hello " + name;
    }
}
