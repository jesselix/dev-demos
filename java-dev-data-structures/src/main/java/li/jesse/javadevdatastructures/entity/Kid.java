package li.jesse.javadevdatastructures.entity;

public class Kid {

    private int kidId;
    private String name;

    public int getKidId() {
        return kidId;
    }

    public Kid(int kidId, String name) {
        this.kidId = kidId;
        this.name = name;
    }

    public void setKidId(int kidId) {
        this.kidId = kidId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Kid{" +
                "kidId=" + kidId +
                ", name='" + name + '\'' +
                '}';
    }
}
