package li.jesse.jdbasics.entity;

import java.io.Serializable;

public class Dog implements Serializable {

    private static final long serialVersionUID = 1L;

    private String dogName;

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }
}
