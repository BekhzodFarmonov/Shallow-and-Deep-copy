package uz.pdp.shallowCopy;

public class Person {
    private String name;
    private Car car;

    public Person(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
