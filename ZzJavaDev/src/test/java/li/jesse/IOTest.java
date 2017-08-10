package li.jesse;

// http://ifeve.com/java-io/
// https://www.ibm.com/developerworks/cn/java/j-lo-javaio/

import org.junit.Test;

import java.io.*;

public class IOTest
{
    @Test
    public void fileLength()
    {
        int count = 0;

        InputStream inputStream = null;

        try
        {
            inputStream = new FileInputStream(new File("c:/zzz.txt"));
            while (inputStream.read() != -1)
            {
                count++;
            }

            System.out.println(count);

        } catch (FileNotFoundException e1)
        {
            e1.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        } finally
        {
            try
            {
                inputStream.close();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }


    }

    public String bufferedRead(String fileName) throws IOException
    {
        BufferedReader in = new BufferedReader(new FileReader(fileName));

        String s = null;
        StringBuilder sb = new StringBuilder();

        while ((s = in.readLine()) != null)
        {
            sb.append(s + "\n");
        }

        in.close();
        return sb.toString();
    }

    @Test
    public void testIt() throws IOException
    {
        System.out.println(bufferedRead("./src/test/resources/zzz.txt"));
    }


}
