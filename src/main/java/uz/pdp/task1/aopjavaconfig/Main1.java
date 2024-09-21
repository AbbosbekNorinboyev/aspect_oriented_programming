package uz.pdp.task1.aopjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
        TransformAspect1 transformAspect1 = container.getBean(TransformAspect1.class);
        transformAspect1.transformRun();
    }
}
