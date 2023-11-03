package com.example.springframework.beans.factory.config;

/**
 * Bean的引用
 *
 * @author 柒加壹
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
