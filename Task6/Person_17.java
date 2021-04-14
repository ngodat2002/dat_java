package Task6;

public class Person_17 {
    private String name,address;

    public Person_17(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person_17{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
