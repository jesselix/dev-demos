package li.jesse.javadevbasics.classz;

import org.junit.Test;

public class ClassLoaderTest {

    @Test
    public void testClassLoader() {
        System.out.println("class loader for HashMap: " + java.util.HashMap.class.getClassLoader());
//        System.out.println("class loader for DNSNameService: "
//                + sun.net.spi.nameservice.dns.DNSNameService.class
//                .getClassLoader());
        System.out.println("class loader for this class: " + ClassLoaderTest.class.getClassLoader());

//        System.out.println(com.mysql.jdbc.Blob.class.getClassLoader());
    }
}
