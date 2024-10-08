package com.kitty.rpc.provider;

import com.kitty.rpc.server.annotation.RpcComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RpcComponentScan(basePackages = {"com.wxy.rpc.provider"})
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
