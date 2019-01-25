package li.jesse.javadevbasics.entity;

import java.io.Serializable;

public class Panda implements Animal, Serializable {

    private static final long serialVersionUID = 1234567890L;

    public int pandaId;
    public String name;
//    public int age;

    public void eat() {
        System.out.println("eat bamboo");
    }

    public Panda(int pandaId, String name) {
        this.pandaId = pandaId;
        this.name = name;
    }

//    public Panda(int pandaId, String name, int age) {
//        this.pandaId = pandaId;
//        this.name = name;
//        this.age = age;
//    }

    @Override
    public String toString() {
        return "Panda{" +
                "pandaId=" + pandaId +
                ", name='" + name + '\'' +
                '}';
    }

//    @Override
//    public String toString() {
//        return "Panda{" +
//                "pandaId=" + pandaId +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
