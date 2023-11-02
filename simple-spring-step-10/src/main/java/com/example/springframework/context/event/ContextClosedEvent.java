package com.example.springframework.context.event;

/**
 * Event raised when an <code>ApplicationContext</code> gets closed.
 *
 * @author 柒加壹
 */
public class ContextClosedEvent extends ApplicationContextEvent {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ContextClosedEvent(Object source) {
        super(source);
    }
}
