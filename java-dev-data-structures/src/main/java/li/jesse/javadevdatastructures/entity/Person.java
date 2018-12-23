package li.jesse.javadevdatastructures.entity;

import java.util.Objects;

public class Person {

    private String name;
    private int yearOfBirth;

    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return yearOfBirth == person.yearOfBirth &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfBirth);
    }
}
