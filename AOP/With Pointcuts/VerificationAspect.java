package com.Prac7; 


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class VerificationAspect {

@Pointcut("execution (* com.Prac7.Deposit.payment())")
public void targetMethods1() {}

@Pointcut("execution (* com.Prac7.Withdraw.drawout())")
public void targetMethods2() {}

@Pointcut("execution (* com.Prac7.Beneficiary.addBeneficiary())")
public void targetMethods3() {}

@Pointcut("targetMethods1() || targetMethods2() || targetMethods3()")
public void targetMethods() {}

@Before("targetMethods()")
public void accountLogin() {
    System.out.println("Account login.");
}

@After("targetMethods()")
public void accountLogout() {
    System.out.println("Account logout.");
}
}
