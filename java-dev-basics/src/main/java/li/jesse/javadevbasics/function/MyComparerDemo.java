package li.jesse.javadevbasics.function;

import li.jesse.javadevbasics.entity.Student02;

import java.util.Comparator;

public class MyComparerDemo implements Comparator<Student02> {


    @Override
    public int compare(Student02 o1, Student02 o2) {
        if(o1.getName().length()>o2.getName().length())
            return 1;

        if(o1.getName().length()<o2.getName().length())
            return -1;

        if(o1.getName().compareTo(o2.getName())==0)
            return o1.getAge()-o2.getAge();

        return o1.getName().compareTo(o2.getName());
    }
}
