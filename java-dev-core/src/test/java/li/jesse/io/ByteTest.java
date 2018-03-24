package li.jesse.io;

import org.junit.Test;

import java.io.*;

public class ByteTest
{
    @Test
    public void testWriteData() throws IOException
    {
        File f = new File("c:\\xx" + File.separator + "test.txt");
        OutputStream out = new FileOutputStream(f);
        String str = "Hello World";
        byte[] b = str.getBytes();
        out.write(b);
        out.close();
    }

    @Test
    public void testReadData() throws IOException
    {
        File f = new File("c:\\xx" + File.separator + "test.txt");
        InputStream in = new FileInputStream(f);
        byte[] b = new byte[(int) f.length()];
        in.read(b);
        in.close();
        System.out.println(new String(b));
    }
}
