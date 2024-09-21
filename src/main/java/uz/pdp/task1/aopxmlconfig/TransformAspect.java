package uz.pdp.task1.aopxmlconfig;

import java.util.Random;

public class TransformAspect {
    public void transform() {
        if (new Random().nextBoolean()) {
            System.out.println("Transform performing well");
        } else {
            throw new RuntimeException("Transform is bad");
        }
    }
}
