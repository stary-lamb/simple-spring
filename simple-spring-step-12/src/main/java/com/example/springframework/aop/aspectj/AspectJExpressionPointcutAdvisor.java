package com.example.springframework.aop.aspectj;

import com.example.springframework.aop.Pointcut;
import com.example.springframework.aop.PointcutAdvisor;
import org.aopalliance.aop.Advice;

/**
 * Spring AOP Advisor that can be used for any AspectJ pointcut expression.
 *
 * @author 柒加壹
 */
public class AspectJExpressionPointcutAdvisor implements PointcutAdvisor {

    /**
     * 切面
     */
    private AspectJExpressionPointcut pointcut;
    /**
     * 具体拦截方法
     */
    private Advice advice;

    /**
     * 表达式
     */
    private String expression;

    public void setExpression(String expression) {
        this.expression = expression;
    }


    @Override
    public Pointcut getPointcut() {
        if (pointcut == null) {
            pointcut = new AspectJExpressionPointcut(expression);
        }
        return pointcut;
    }

    @Override
    public Advice getAdvice() {
        return advice;
    }

    public void setAdvice(Advice advice){
        this.advice = advice;
    }
}
