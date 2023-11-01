package com.example.springframework.beans.factory.support;

import com.example.springframework.beans.BeansException;
import com.example.springframework.beans.factory.config.BeanDefinition;
import com.example.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 核心实现类
 *
 * @author 柒加壹
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

    private final Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) {
            throw new BeansException("No bean named '" + beanName + "' is defined");
        }
        return beanDefinition;
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }
}
