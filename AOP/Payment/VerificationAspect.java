package com.Prac7; 
import org.aspectj.lang.annotation.Aspect; 
import org.aspectj.lang.annotation.Before; 
import org.aspectj.lang.annotation.After; 

 @Aspect 
public class VerificationAspect { 
    @Before("execution(* com.Prac7.Deposit.payment(..)) || execution(* com.Prac7.Withdraw.drawout(..)) || execution(* com.Prac7.Beneficiary.addBeneficiary(..))")     public void accountLogin() { 
        System.out.println("Account login"); 
    } 
 
    @After("execution(* com.Prac7.Deposit.payment(..)) || execution(* com.Prac7.Withdraw.drawout(..)) || execution(* com.Prac7.Beneficiary.addBeneficiary(..))")     public void accountLogout() { 
        System.out.println("Account logout"); 
    } 
}