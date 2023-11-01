package com.example.springframework.beans.factory;

import com.example.springframework.beans.BeansException;

/**
 * Bean创建工厂接口
 *
 * @author 柒加壹
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name,Object... args) throws BeansException;
}
