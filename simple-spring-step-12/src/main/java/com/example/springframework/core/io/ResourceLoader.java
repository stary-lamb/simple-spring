package com.example.springframework.core.io;

/**
 * 包资源加载器
 *
 * @author 柒加壹
 */
public interface ResourceLoader {
    /**
     * Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);

}
