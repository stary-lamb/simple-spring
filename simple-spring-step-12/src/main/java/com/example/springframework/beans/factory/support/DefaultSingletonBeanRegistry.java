package com.example.springframework.beans.factory.support;

import com.example.springframework.beans.BeansException;
import com.example.springframework.beans.factory.DisposableBean;
import com.example.springframework.beans.factory.config.SingletonBeanRegistry;
import com.example.springframework.context.event.ApplicationEventMulticaster;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * 获取和注册单例对象实现
 * @author 柒加壹
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    /**
     * Internal marker for a null singleton object:
     * used as marker value for concurrent Maps (which don't support null values).
     */
    protected static final Object NULL_OBJECT = new Object();

    private final Map<String, Object> singletonObjects = new HashMap<>();

    private final Map<String, DisposableBean> disposableBeans = new HashMap<>();

    /**
     * 获取单例对象
     * @param beanName bean的名称
     * @return
     */
    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    /**
     * 注册单例对象
     * @param beanName bean的名称
     * @param singletonObject 单例bean
     */
    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }

    public void registerDisposableBean(String beanName,DisposableBean bean){
        disposableBeans.put(beanName,bean);
    }


    public void destroySingletons(){
        Set<String> keySet = this.disposableBeans.keySet();
        Object[] disposableBeanNames = keySet.toArray();

        for (int i = disposableBeanNames.length - 1; i >= 0; i--) {
            Object beanName = disposableBeanNames[i];
            DisposableBean disposableBean = disposableBeans.remove(beanName);
            try {
                disposableBean.destroy();
            } catch (Exception e) {
                throw new BeansException("Destroy method on bean with name '" + beanName + "' threw an exception", e);
            }
        }
    }

    @Override
    public void registerSingleton(String beanName, ApplicationEventMulticaster singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }
}
