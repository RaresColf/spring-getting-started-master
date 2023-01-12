package ro.sda.aop.example1.aspects;

import org.aspectj.lang.annotation.*;

@Aspect
public class MathServiceAspect {

    @Before("execution(* ro.sda.aop.example1.services.MathService.*(..))")
    public void before() {
        System.out.println("Before");
    }
    @After("execution(* ro.sda.aop.example1.services.MathService.*(..))")
    public void after() {
        System.out.println("After");
    }

    @AfterThrowing("execution(* ro.sda.aop.example1.services.MathService.*(..))")
    public void afterThrowing() {
        System.out.println("The method has just thrown an exception");
    }

    @AfterReturning("execution(* ro.sda.aop.example1.services.MathService.*(..))")
    public void afterReturning() {
        System.out.println("Method successfully executed");
    }


}
