package uz.pdp.task1.aopjavaconfig;

import java.util.Random;

public class TransformAspect1 {
    public void transformRun() {
        if (new Random().nextBoolean()) {
            System.out.println("Transform1 is run");
        } else {
            throw new RuntimeException("Transform1 is bad");
        }
    }
}
