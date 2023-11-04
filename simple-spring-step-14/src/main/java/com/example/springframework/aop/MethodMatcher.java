package com.example.springframework.aop;

import java.lang.reflect.Method;

/**
 * Part of a {@link Pointcut}: Checks whether the target method is eligible for advice.
 *
 * @author 柒加壹
 */
public interface MethodMatcher {

    /**
     * Perform static checking whether the given method matches. If this
     *
     * @return whether or not this method matches statically
     */
    boolean matches(Method method, Class<?> targetClass);

}

