package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.concurrent.ForkJoinTask;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUnilibrary(){
//    }
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUnilibrary(){
//    }
//
//    @Pointcut("allMethodsFromUnilibrary() && !returnMagazineFromUnilibrary()")
//    private void allMethodsExceptReturnMagazineFromUnilibrary(){
//
//    }
//
//    @Before("allMethodsExceptReturnMagazineFromUnilibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log #10");
//    }
//
//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){
//    }
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUnilibrary(){
//    }
//
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUnilibrary()")
//    private void allGetAndReturnMethodsFromUnilibrary(){
//    }
//
//
//
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log # 1");
//    }
//
//    @Before("allReturnMethodsFromUnilibrary()")
//    public void beforeRerutnLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log # 2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUnilibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println(" beforeGetAndReturnLoggingAdvice: writing Log # 3");
//    }
//



    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){

MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        System.out.println("methodSignature =" +  methodSignature);
        System.out.println("methodSignature.getMethod() ="
                +  methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() ="
                +  methodSignature.getReturnType());
        System.out.println("methodSignature.getName() ="
                +  methodSignature.getName());

        if(methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for(Object obj: arguments){
                if(obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("инфорация о книге " +myBook.getName() + ", автор - " +myBook.getAuthor()+
                            "год издания" + myBook.getYearOfPublication());
                }else if(obj instanceof String){
                    System.out.println("книгу в библиотеку добавляет" + obj);
                }
            }
        }


        System.out.println("beforeGetBookAdvice: логирование" +
                "попытка получить книгу/журнал");
        System.out.println("---------------------------------------");
    }




}
