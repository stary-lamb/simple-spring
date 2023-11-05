package com.example.springframework.context;

import com.example.springframework.context.event.ApplicationContextEvent;


/**
 * Event raised when an <code>ApplicationContext</code> gets initialized or refreshed.
 *
 * @author 柒加壹
 */
public class ContextRefreshedEvent extends ApplicationContextEvent {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ContextRefreshedEvent(Object source) {
        super(source);
    }
}
