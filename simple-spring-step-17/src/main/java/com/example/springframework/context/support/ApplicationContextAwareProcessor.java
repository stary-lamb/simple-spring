package com.example.springframework.context.support;

import com.example.springframework.beans.BeansException;
import com.example.springframework.beans.factory.config.BeanPostProcessor;
import com.example.springframework.context.ApplicationContext;
import com.example.springframework.context.ApplicationContextAware;

/**
 * @author 柒加壹
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {
    private final ApplicationContext applicationContext;


    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware) {
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
