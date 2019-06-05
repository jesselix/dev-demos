package li.jesse.javadevbasics.serialization;

import li.jesse.javadevbasics.entity.Panda;
import org.junit.Test;

import java.io.*;

public class SerializationTest {

    @Test
    public void testSerial() throws IOException {
        Panda panda = new Panda(1234, "pan pan");
        System.out.println("Panda Serial" + panda);
        FileOutputStream fos = new FileOutputStream("C:\\xx\\panda.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(panda);
        oos.flush();
        oos.close();
    }

    @Test
    public void testDeSerial() throws IOException, ClassNotFoundException {
        Panda panda;

        FileInputStream fis = new FileInputStream("C:\\xx\\panda.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        panda = (Panda) ois.readObject();
        ois.close();
        System.out.println("Panda Deserial" + panda);
    }
}
