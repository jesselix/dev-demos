package li.jesse.entity;

import java.io.Serializable;

public class User implements Serializable
{
    private String name;
    private int age;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public User()
    {

    }

    public User(String name)
    {
        this.name = name;
    }

    public User(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void gogo()
    {
        System.out.println("gogo");
    }

    public void gogo2(String x, String y)
    {
        System.out.println(x + " " + y);
    }
}
