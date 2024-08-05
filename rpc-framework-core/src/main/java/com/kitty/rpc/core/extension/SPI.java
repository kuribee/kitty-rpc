package com.kitty.rpc.core.extension;

import java.lang.annotation.*;

/**
 * SPI注解，被标注的类表示为需要加载的扩展类接口
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SPI {
}
