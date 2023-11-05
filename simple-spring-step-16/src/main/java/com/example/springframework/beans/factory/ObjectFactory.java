package com.example.springframework.beans.factory;

import com.example.springframework.beans.BeansException;

/**
 * Defines a factory which can return an Object instance
 * (possibly shared or independent) when invoked.
 *
 * @param <T>
 * @author 柒加壹
 */
public interface ObjectFactory<T> {

    T getObject() throws BeansException;
}
