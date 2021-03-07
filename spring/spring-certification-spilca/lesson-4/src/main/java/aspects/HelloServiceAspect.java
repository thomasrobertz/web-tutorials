package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloServiceAspect {

    @Around("execution (* services.HelloService.sayHelloTo(..))")
    public Object aroundSayHelloTo(ProceedingJoinPoint proceeding) throws Throwable {
        System.out.println("Around override");
        return proceeding.proceed();
    }

    /*
    @Before("execution (* services.HelloService.sayHelloTo(..))")
    public void beforeSayHelloTo() {
        System.out.println("Before services.HelloService.sayHelloTo()");
    }

    @After("execution (* services.HelloService.sayHelloTo(..))")
    public void afterSayHelloTo() {
        System.out.println("After services.HelloService.sayHelloTo()");
    }

    @AfterReturning("execution (* services.HelloService.sayHelloTo(..))")
    public void afterReturningSayHelloTo() {
        System.out.println("AfterReturning services.HelloService.sayHelloTo()");
    }

    @AfterThrowing("execution (* services.HelloService.sayHelloTo(..))")
    public void afterThrowingSayHelloTo() {
        System.out.println("AfterThrowing services.HelloService.sayHelloTo()");
    }
    */
}
