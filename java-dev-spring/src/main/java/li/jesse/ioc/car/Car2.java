package li.jesse.ioc.car;

public class Car2 {

    private Chassis2 chassis2;

    public Car2(Chassis2 chassis2) {
        this.chassis2 = chassis2;
    }

    public void run() {
        System.out.println("car running");
    }

}
