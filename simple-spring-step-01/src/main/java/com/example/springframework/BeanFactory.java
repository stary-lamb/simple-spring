package com.example.springframework;

import javax.crypto.interfaces.PBEKey;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * bean对象的工厂
 * @author 柒加壹1
 */
public class BeanFactory {
    private Map<String,BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    /**
     * Bean对象的获取
     * @param name bean名称
     * @return
     */
    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

    /**
     * 注册Bean对象
     * @param name bean名称
     * @param beanDefinition bean对象
     */
    public void registerBeanDefinition(String name,BeanDefinition beanDefinition){
        beanDefinitionMap.put(name,beanDefinition);
    }
}
