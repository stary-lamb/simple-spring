package com.example.springframework;

/**
 * Bean对象
 *
 * @author 柒加壹
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
