package com.example.springframework.util;

import com.example.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * Simple strategy interface for resolving a String value.
 * Used by {@link ConfigurableBeanFactory}.
 * <p>
 *
 * @author 柒加壹
 */
public interface StringValueResolver {

    String resolveStringValue(String strVal);
}
