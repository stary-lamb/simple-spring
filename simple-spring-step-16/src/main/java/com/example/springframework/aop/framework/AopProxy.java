package com.example.springframework.aop.framework;

/**
 * Delegate interface for a configured AOP proxy, allowing for the creation
 * of actual proxy objects.
 *
 * <p>Out-of-the-box implementations are available for JDK dynamic proxies
 * and for CGLIB proxies, as applied by DefaultAopProxyFactory
 * <p>
 * AOP 代理的抽象
 *
 * <p>
 *
 * @author 柒加壹
 */
public interface AopProxy {

    Object getProxy();
}
