package org.example.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.example.models.ToDo;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Around("@annotation(org.example.config.ProjectConfig.toLog)")
    public void toLog(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Log metodo " + joinPoint.getSignature().getName());

        joinPoint.proceed();

        System.out.println("Fine log metodo " + joinPoint.getSignature().getName());
    }

    @Around("@annotation(org.example.config.ProjectConfig.toTrim)")
    public void toTrim(ProceedingJoinPoint joinPoint) throws  Throwable{
        System.out.println("log metodo "+joinPoint.getSignature().getName());
        Object[] array = joinPoint.getArgs();
        for(Object x : array){
            if(x instanceof ToDo){
                String nomeToDo = ((ToDo) x).getTodo().trim();
                String expiryDate = ((ToDo) x).getExpiryDate().trim();
                String startDate = ((ToDo) x).getCreateDate().trim();
                String modifyDate = ((ToDo) x).getModifieData().trim();

                ((ToDo) x).setTodo(nomeToDo);
                ((ToDo) x).setCreateDate(startDate);
                ((ToDo) x).setModifieData(modifyDate);
                ((ToDo) x).setExpiryDate(expiryDate);
            }
        }

        joinPoint.proceed(array);
    }
}
