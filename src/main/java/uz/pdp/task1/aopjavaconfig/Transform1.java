package uz.pdp.task1.aopjavaconfig;

import org.aspectj.lang.annotation.*;

@Aspect
public class Transform1 {
    @Before("execution(* uz.pdp.task1.aopjavaconfig.TransformAspect1.transformRun(..))")
    public void begin() {
        System.out.println("Transform is running");
    }

    @Before("execution(* uz.pdp.task1.aopjavaconfig.TransformAspect1.transformRun(..))")
    public void start() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    @AfterReturning("execution(* uz.pdp.task1.aopjavaconfig.TransformAspect1.transformRun(..))")
    public void commit() {
        System.out.println("Transform is committed");
    }

    @AfterThrowing("execution(* uz.pdp.task1.aopjavaconfig.TransformAspect1.transformRun(..))")
    public void refund() {
        System.out.println("Transform is bad: \uD83E\uDD27\uD83E\uDD27\uD83E\uDD27\uD83E\uDD27\uD83E\uDD27\uD83E\uDD27");
    }

    @After("execution(* uz.pdp.task1.aopjavaconfig.TransformAspect1.transformRun(..))")
    public void stop() {
        System.out.println("Transform is stopped");
    }
}
