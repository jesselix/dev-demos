package li.jesse.javadevbasics.basic;

import li.jesse.javadevbasics.entity.Dog;
import li.jesse.javadevbasics.entity.PetHost;
import li.jesse.javadevbasics.util.ObjCloneUtil;
import org.junit.Test;

public class CloneTest {

    @Test
    public void testDeepClone() {
        PetHost perHost1 = new PetHost();
        perHost1.setUsername("张三");

        Dog dog = new Dog();
        dog.setDogName("小狗1");

        perHost1.setDog(dog);

        PetHost perHost2 = ObjCloneUtil.cloneObj(perHost1);

        System.out.println("pet host name : " + perHost1.getpetHostName());
        System.out.println("pet host dog name : " + perHost1.getDog().getDogName());
        System.out.println("pet host 2 name : " + perHost2.getpetHostName());
        System.out.println("pet host 2 dog name : " + perHost2.getDog().getDogName());

        System.out.println("-------------------------------------");

        perHost2.setUsername("李四");
        perHost2.getDog().setDogName("小狗2");;

        System.out.println("pet host name : " + perHost1.getpetHostName());
        System.out.println("pet host dog name : " + perHost1.getDog().getDogName());
        System.out.println("pet host 2 name : " + perHost2.getpetHostName());
        System.out.println("pet host 2 dog name : " + perHost2.getDog().getDogName());
    }

}
