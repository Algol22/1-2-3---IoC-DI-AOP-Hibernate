package aop.aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggiingAdvice(ProceedingJoinPoint proceedingJoinPoint)
        throws Throwable{
        System.out.println("aroundReturnBookLoggiingAdvice в библиотеку пытаются вернуть книгу");

//        long begin = System.currentTimeMillis();
        Object targetMethodResult = null;
        try {
           // Object targetMethodResult = proceedingJoinPoint.proceed();
//        long end = System.currentTimeMillis();
        }
        catch (Exception e){
            System.out.println("поймано исключение" + e);
        throw e;
        }

        System.out.println("aroundReturnBookLoggiingAdvice в библиотеку возврящают книгу");
//        System.out.println("aroundReturnBookLoggiingAdvice:" + (end-begin) + "ms");
return targetMethodResult;
    }
}
