package li.jesse.jdbasics.util;

import li.jesse.jdbasics.entity.Animal;

public class AnimalFactory
{
    public static Animal getInstance(String ClassName)
    {
        Animal animal = null;

        try
        {
            animal = (Animal) Class.forName(ClassName).newInstance();
        } catch (InstantiationException e)
        {
            e.printStackTrace();
        } catch (IllegalAccessException e)
        {
            e.printStackTrace();
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }

        return animal;
    }
}
