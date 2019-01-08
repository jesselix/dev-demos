package li.jesse.javadevbasics.basic;

import li.jesse.javadevbasics.entity.Employee;
import li.jesse.javadevbasics.util.SerializationUtil;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;

public class SerializationTest {

    @Test
    public void testSerialization() {
        String fileName = "C:\\xx\\employee.ser";
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
}
