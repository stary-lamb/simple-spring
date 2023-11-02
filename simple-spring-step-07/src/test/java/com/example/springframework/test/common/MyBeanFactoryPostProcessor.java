package com.example.springframework.test.common;


import com.example.springframework.beans.BeansException;
import com.example.springframework.beans.PropertyValue;
import com.example.springframework.beans.PropertyValues;
import com.example.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.example.springframework.beans.factory.config.BeanDefinition;
import com.example.springframework.beans.factory.config.BeanFactoryPostProcessor;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));
    }

}
