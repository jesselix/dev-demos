package li.jesse.io;

import li.jesse.entity.User;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialTest
{
    private String file = "c:\\xx\\obj.dat";

    @Test
    public void testSerial() throws Exception
    {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

        User user = new User("Andy", 11);
        oos.writeObject(user);
        oos.flush();
        oos.close();
    }

    @Test
    public void testSerial1() throws Exception
    {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        User user = (User)ois.readObject();
        System.out.println(user);
        ois.close();
    }

}
