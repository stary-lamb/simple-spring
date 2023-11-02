package com.example.springframework.beans.factory.config;


/**
 * 注册和获取单例对象接口
 *
 * @author 柒加壹
 */
public interface SingletonBeanRegistry {

    /**
     * 获取单例bean
     * @param beanName
     * @return
     */
    Object getSingleton(String beanName);


    /**
     * 销毁单例对象
     */
    void destroySingletons();
}
