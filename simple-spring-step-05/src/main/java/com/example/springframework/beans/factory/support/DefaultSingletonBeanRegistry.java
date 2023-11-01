package com.example.springframework.beans.factory.support;

import com.example.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;


/**
 * 获取和注册单例对象实现
 * @author 柒加壹
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private final Map<String, Object> singletonObjects = new HashMap<>();

    /**
     * 获取单例对象
     * @param beanName bean的名称
     * @return
     */
    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    /**
     * 注册单例对象
     * @param beanName bean的名称
     * @param singletonObject 单例bean
     */
    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }
}
