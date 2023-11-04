package com.example.springframework.context;

import com.example.springframework.beans.factory.HierarchicalBeanFactory;
import com.example.springframework.beans.factory.ListableBeanFactory;
import com.example.springframework.core.io.ResourceLoader;

/**
 * 应用上下文
 *
 * @author 柒加壹
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}
