package li.jesse.io;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

public class EncodingTest
{
    @Test
    public void testEncoding() throws UnsupportedEncodingException
    {
        String str = "香蕉ab";

        // utf-8: 3 bytes for Chinese character, 1 byte for English letter
        byte[] bytes = str.getBytes();
        for (byte b : bytes)
        {
            System.out.print(Integer.toHexString(b & 0xff) + " ");
        }

        System.out.println();

        // utf-8: 2 bytes for Chinese character, 1 byte for English letter
        byte[] bytes1 = str.getBytes("gbk");
        for (byte b : bytes1)
        {
            System.out.print(Integer.toHexString(b & 0xff) + " ");
        }

        System.out.println();

        // utf-8: 2 bytes for Chinese character, 2 bytes for English letter
        byte[] bytes2 = str.getBytes("utf-16be");
        for (byte b : bytes2)
        {
            System.out.print(Integer.toHexString(b & 0xff) + " ");
        }
    }
}
