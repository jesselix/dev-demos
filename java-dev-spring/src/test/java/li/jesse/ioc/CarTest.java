package li.jesse.ioc;

import org.junit.Test;

public class CarTest {

    @Test
    public void testNonIOCCar() {
        int size = 20;
        Car1 car1 = new Car1(size);
        car1.run();
    }

    @Test
    public void testIOCCar() {
        int size = 20;
        Tire2 tire2 = new Tire2(size);
        Chassis2 chassis2 = new Chassis2(tire2);
        Car2 car2 = new Car2(chassis2);
        car2.run();
    }

}
