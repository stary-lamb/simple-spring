package com.example.springframework.beans.factory.support;

import com.example.springframework.beans.BeansException;
import com.example.springframework.core.io.Resource;
import com.example.springframework.core.io.ResourceLoader;

/**
 * @author 柒加壹
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;
}
