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
        return proceeding.proceed(new Object[] {"Bill"});
    }
}
