package li.jesse.iocconcept.car;

public class Car1 {

    private Chassis1 chassis1;

    public Car1(int size) {
        this.chassis1 = new Chassis1(size);
    }

    public void run() {
        System.out.println("car running");
    }

}
