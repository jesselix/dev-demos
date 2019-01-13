package li.jesse.javadevbasics.objectz;

import li.jesse.javadevbasics.entity.Panda;
import org.junit.Test;

public class ObjectTest {

    @Test
    public void testObject() {
        Panda panda1 = new Panda();
        Panda panda2 = new Panda();

        System.out.println(panda1.hashCode());
        System.out.println(panda2.hashCode());
    }
}
