package com.example.springframework.aop;

/**
 * Superinterface for all Advisors that are driven by a pointcut.
 * This covers nearly all advisors except introduction advisors,
 * for which method-level matching doesn't apply.
 *
 * @author 柒加壹
 */
public interface PointcutAdvisor extends Advisor {

    /**
     * Get the Pointcut that drives this advisor.
     */
    Pointcut getPointcut();
}
