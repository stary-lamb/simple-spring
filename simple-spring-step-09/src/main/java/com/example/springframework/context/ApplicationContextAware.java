package com.example.springframework.context;


import com.example.springframework.beans.BeansException;

/**
 * Interface to be implemented by any object that wishes to be notified
 * of the {@link ApplicationContext} that it runs in.
 * <p>
 * 实现此接口，既能感知到所属的 ApplicationContext
 *
 * @author 柒加壹
 */
public interface ApplicationContextAware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
