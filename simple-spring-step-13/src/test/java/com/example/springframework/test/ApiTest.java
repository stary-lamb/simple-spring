package com.example.springframework.test;


import com.example.springframework.aop.AdvisedSupport;
import com.example.springframework.aop.ClassFilter;
import com.example.springframework.aop.MethodMatcher;
import com.example.springframework.aop.TargetSource;
import com.example.springframework.aop.aspectj.AspectJExpressionPointcut;
import com.example.springframework.aop.aspectj.AspectJExpressionPointcutAdvisor;
import com.example.springframework.aop.framework.ProxyFactory;
import com.example.springframework.aop.framework.ReflectiveMethodInvocation;
import com.example.springframework.aop.framework.adapter.MethodBeforeAdviceInterceptor;
import com.example.springframework.beans.BeansException;
import com.example.springframework.beans.factory.config.BeanPostProcessor;
import com.example.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.springframework.test.bean.IUserService;
import com.example.springframework.test.bean.UserService;
import org.aopalliance.intercept.MethodInterceptor;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class ApiTest {

    @Test
    public void test_scan() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-scan.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果：" + userService.queryUserInfo());
    }

    @Test
    public void test_property() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-property.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果：" + userService);
    }

    @Test
    public void test_beanPost(){

        BeanPostProcessor beanPostProcessor = new BeanPostProcessor() {
            @Override
            public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
                return null;
            }

            @Override
            public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
                return null;
            }
        };

        List<BeanPostProcessor> beanPostProcessors = new ArrayList<BeanPostProcessor>();
        beanPostProcessors.add(beanPostProcessor);
        beanPostProcessors.add(beanPostProcessor);
        beanPostProcessors.remove(beanPostProcessor);

        System.out.println(beanPostProcessors.size());
    }

}

