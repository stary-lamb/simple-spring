package com.example.springframework.beans;


/**
 * @author 柒加壹
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg){
        super(msg);
    }

    public BeansException(String msg,Throwable cause){
        super(msg,cause);
    }
}
