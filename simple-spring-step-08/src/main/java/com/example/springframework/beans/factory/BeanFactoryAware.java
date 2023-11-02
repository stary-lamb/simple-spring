package com.example.springframework.beans.factory;

import com.example.springframework.beans.BeansException;
import com.example.springframework.beans.factory.Aware;
import com.example.springframework.beans.factory.BeanFactory;

/**
 * Interface to be implemented by beans that wish to be aware of their
 * owning {@link BeanFactory}.
 * <p>
 * 实现此接口，既能感知到所属的 BeanFactory
 *
 * @author 柒加壹
 */
public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
