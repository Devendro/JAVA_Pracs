package com.Prac7;

import org.aspectj.lang.annotation.Aspect; 
import org.aspectj.lang.annotation.AfterReturning; 

@Aspect 
public class AddAfterReturnAspect { 
    @AfterReturning(pointcut = "execution(* com.Prac7.Multiplier.multiply(int, int))", returning = "result")     public void addResultToProduct(int result) { 
        System.out.println("After-returning advice: Result is " + result); 
    } 
} 
