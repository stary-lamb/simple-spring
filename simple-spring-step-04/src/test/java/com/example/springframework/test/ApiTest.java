package com.example.springframework.test;


import com.example.springframework.beans.PropertyValue;
import com.example.springframework.beans.PropertyValues;
import com.example.springframework.beans.factory.config.BeanDefinition;
import com.example.springframework.beans.factory.config.BeanReference;
import com.example.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.example.springframework.test.bean.UserDao;
import com.example.springframework.test.bean.UserService;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ApiTest {

    @Test
    public void test_BeanFactory(){
        // 1. 初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 注入Bean
        beanFactory.registerBeanDefinition("userDao",new BeanDefinition(UserDao.class));


        // 3. userService 设置属性
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao",new BeanReference("userDao")));

        // 4. UserService 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 5. UserService 获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }


}
