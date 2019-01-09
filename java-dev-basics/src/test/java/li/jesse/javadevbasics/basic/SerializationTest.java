package li.jesse.javadevbasics.basic;

import li.jesse.javadevbasics.entity.Employee;
import li.jesse.javadevbasics.util.SerializationUtil;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;

public class SerializationTest {

    String fileName = "C:\\xx\\employee.ser";

    @Test
    public void testSerialization() {

        Employee emp = new Employee();
        emp.setEmployeeId(100);
        emp.setName("Pankaj");
        emp.setSalary(new BigDecimal(5000));

        try {
            SerializationUtil.serialize(emp, fileName);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        Employee empNew = null;
        try {
            empNew = (Employee) SerializationUtil.deserialize(fileName);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        System.out.println(emp);
        System.out.println(empNew);
    }

    @Test
    public void testSerialVersionUID() {
        Employee empNew = null;

        try {
            empNew = (Employee) SerializationUtil.deserialize(fileName);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        System.out.println("empNew Object::"+empNew);
    }
}
