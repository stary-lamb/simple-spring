package com.example.springframework.beans.factory.support;

import com.example.springframework.beans.factory.config.BeanDefinition;

/**
 * @author 柒加壹
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
