package uz.pdp.task1.aopxmlconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("ioc-config.xml");
        TransformAspect transformAspect = container.getBean(TransformAspect.class);
        transformAspect.transform();
    }
}
