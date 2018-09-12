package li.jesse.reflection;

import li.jesse.entity.Animal;
import li.jesse.entity.User;
import li.jesse.util.AnimalFactory;
import org.junit.Test;

import java.io.Serializable;
import java.lang.reflect.*;
import java.util.ArrayList;

// http://www.cnblogs.com/lzq198754/p/5780331.html

public class ReflectionTest implements Serializable {

    @Test
    public void testGetPackageNameAndClassName() {
        ReflectionTest reflectionTest = new ReflectionTest();
        System.out.println(reflectionTest.getClass().getName());
    }

    @Test
    public void testInstantiateClassObject() throws ClassNotFoundException {
        Class<?> clazz1;
        Class<?> clazz2;
        Class<?> clazz3;

        clazz1 = Class.forName("li.jesse.reflection.ReflectionTest");
        clazz2 = new ReflectionTest().getClass();
        clazz3 = ReflectionTest.class;

        System.out.println(clazz1.getName());
        System.out.println(clazz2.getName());
        System.out.println(clazz3.getName());
    }

    @Test
    public void testGetParentClassOfAnOjbect() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("li.jesse.reflection.ReflectionTest");
        Class<?> parentClazz = clazz.getSuperclass();
        System.out.println(parentClazz.getName());
    }

    @Test
    public void testGetInterfaceOfAnObject() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("li.jesse.reflection.ReflectionTest");

        Class<?> inters[] = clazz.getInterfaces();
        for (int i = 0; i < inters.length; i++) {
            System.out.println(i + ": " + inters[i].getName());
        }
    }

    // 通过反射机制实例化一个类的对象
    @Test
    public void testReflection04() throws Exception {
        Class<?> clazz01 = Class.forName("li.jesse.entity.User");

        User user = (User) clazz01.newInstance();
        user.setName("Jack");
        user.setAge(21);
        System.out.println(user);

        Constructor<?> cons[] = clazz01.getConstructors();
        for (int i = 0; i < cons.length; i++)
        {
            Class<?> clazzs[] = cons[i].getParameterTypes();
            System.out.print("cons[" + i + "] (");
            for (int j = 0; j < clazzs.length; j++) {
                if (j == clazzs.length - 1)
                    System.out.print(clazzs[j].getName());
                else
                    System.out.print(clazzs[j].getName() + ",");
            }
            System.out.println(")");
        }

        user = (User) cons[0].newInstance("Rollen");
        System.out.println(user);
        user = (User) cons[1].newInstance(20, "Rollen");
        System.out.println(user);
    }

    // 获取某个类的全部属性
    @Test
    public void testReflection05() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("li.jesse.entity.User");

        Field[] fields = clazz.getDeclaredFields();

//        for (int i = 0; i < fields.length; i++)
//        {
//            int mo = fields[i].getModifiers();
//            String priv = Modifier.toString(mo);
//
//            Class<?> type = fields[i].getType();
//
//            System.out.println(priv + " " + type.getName() + " " + fields[i].getName() + ";");
//        }

        Field[] filed1 = clazz.getFields();
        for (int j = 0; j < filed1.length; j++) {
            int mo1 = filed1[j].getModifiers();
            String priv1 = Modifier.toString(mo1);

            Class<?> type = filed1[j].getType();
            System.out.println(priv1 + " " + type.getName() + " " + filed1[j].getName() + ";");
        }
    }

    // 获取某个类的全部方法
    @Test
    public void testReflection06() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("li.jesse.entity.User");
        Method methods[] = clazz.getMethods();

        for (int i = 0; i < methods.length; i++) {
            Class<?> returnType = methods[i].getReturnType();
            Class<?> paramTypes[] = methods[i].getParameterTypes();
            int temp = methods[i].getModifiers();

            System.out.println(Modifier.toString(temp));
            System.out.println(returnType.getName());
            System.out.println(methods[i].getName());

            for (int j = 0; j < paramTypes.length; j++) {
                System.out.println(paramTypes[j].getName() + " " + j);
            }
        }
    }

    // 通过反射机制调用某个类的方法
    @Test
    public void testReflection07() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> clazz = Class.forName("li.jesse.entity.User");

//        Method method = clazz.getMethod("gogo");
//        method.invoke(clazz.newInstance());

        Method method = clazz.getMethod("gogo2", String.class, String.class);
        method.invoke(clazz.newInstance(), "123", "456");
    }

    // 通过反射机制操作某个类的属性
    @Test
    public void testReflection08() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class<?> clazz = Class.forName("li.jesse.entity.User");
        Object object = clazz.newInstance();

        Field field = clazz.getDeclaredField("age");
        field.setAccessible(true);
        field.set(object, 14);
        System.out.println(field.get(object));
    }


    // 在泛型为Integer的ArrayList中存放一个String类型的对象
    @Test
    public void testReflectionA() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(101);
        Method method = list.getClass().getMethod("add", Object.class);
        method.invoke(list, "一个字好");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }

    // 通过反射取得并修改数组的信息
    @Test
    public void testReflectionB() {
        int[] testArray = {0, 1, 2, 3, 4, 5};

        Class<?> clazz = testArray.getClass().getComponentType();
        System.out.println(clazz.getName());
        System.out.println(Array.getLength(testArray));
        System.out.println(Array.get(testArray, 0));
        Array.set(testArray, 0, 1000);
        System.out.println(Array.get(testArray, 0));
    }

    public void testReflectionC() {

    }

    @Test
    public void testReflectionD() {
        Animal animal = AnimalFactory.getInstance("li.jesse.entity.Monkey");

        if (animal != null) {
            animal.eat();
        }
    }
}
