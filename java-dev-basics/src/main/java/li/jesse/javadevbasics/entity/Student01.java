package li.jesse.javadevbasics.entity;

public class Student01 implements Comparable<Student01> {

    private String name;
    private int age;

    public Student01() {
    }

    public Student01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student01 o) {
        if (this.age != o.age) {
            return this.age - o.age;
        } else
            return this.name.compareTo(o.name);
    }

}
