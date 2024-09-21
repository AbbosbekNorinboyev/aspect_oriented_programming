package uz.pdp.task1.aopxmlconfig;

public class Transform {
    public void begin() {
        System.out.println("Transform is running");
    }

    public void start() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void commit() {
        System.out.println("Transform committed");
    }

    public void refund() {
        System.out.println("Transform is bad: \uD83E\uDD27\uD83E\uDD27\uD83E\uDD27\uD83E\uDD27");
    }

    public void stop() {
        System.out.println("Transform is stopped");
    }
}
