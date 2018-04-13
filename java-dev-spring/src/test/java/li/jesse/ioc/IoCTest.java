package li.jesse.ioc;

import li.jesse.ioc.car.Car1;
import li.jesse.ioc.car.Car2;
import li.jesse.ioc.car.Chassis2;
import li.jesse.ioc.car.Tire2;
import li.jesse.ioc.texteditor.TextEditor;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCTest {

    @Test
    public void testNonIoCCar() {
        int size = 20;
        Car1 car1 = new Car1(size);
        car1.run();
    }

    @Test
    public void testIoCCar() {
        int size = 20;
        Tire2 tire2 = new Tire2(size);
        Chassis2 chassis2 = new Chassis2(tire2);
        Car2 car2 = new Car2(chassis2);
        car2.run();
    }

    @Test
    public void testIoCTextEditor() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/Beans.xml");
        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.spellCheck();
    }

}
