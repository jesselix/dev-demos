package li.jesse.javadevbasics.basic;

import li.jesse.javadevbasics.entity.Employee;
import org.junit.Test;

import java.math.BigDecimal;

public class SerializationTest {

    @Test
    public void testSerialization() {
        String fileName="employee.ser";
        Employee emp = new Employee();
        emp.setEmployeeId(100);
        emp.setName("Pankaj");
        emp.setSalary(new BigDecimal(5000));

        
    }
}
