package li.jesse.javadevbasics.io;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class FileTest
{
    @Test
    public void testFile()
    {
        File file = new File("c:\\xx\\iioo");
        System.out.println(file.exists());

        if (!file.exists())
        {
            file.mkdir();
        }
        else
        {
            file.delete();
        }

        System.out.println(file.isDirectory());
    }

    @Test
    public void testFile1()
    {
        File file1 = new File("c:\\xx", "自己.txt");

        if (!file1.exists())
        {
            try
            {
                file1.createNewFile();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            file1.delete();
            System.out.println(file1.getName());
        }
    }
}
