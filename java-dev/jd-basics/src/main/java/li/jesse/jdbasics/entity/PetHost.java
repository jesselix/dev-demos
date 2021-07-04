package li.jesse.jdbasics.entity;

import java.io.Serializable;

public class PetHost implements Serializable {

    private static final long serialVersionUID = 1L;

    private String petHostName;

    private Dog dog;

    public String getpetHostName() {
        return petHostName;
    }

    public void setUsername(String petHostName) {
        this.petHostName = petHostName;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
