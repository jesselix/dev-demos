package li.jesse.javadevbasics.io;

import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CharacterTest
{
    @Test
    public void testCharacter() throws IOException
    {
        File f = new File("c:\\xx" + File.separator + "test1.txt");
        Writer out = new FileWriter(f);
        String str = "hey you";
        out.write(str);
        out.close();
    }

}
