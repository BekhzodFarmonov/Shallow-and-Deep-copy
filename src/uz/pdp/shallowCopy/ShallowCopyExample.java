package uz.pdp.shallowCopy;

public class ShallowCopyExample {
    public static void main(String[] args) {
        Person person1 = new Person("Ali", new Car("BMW"));
        Person person2=person1;

        System.out.println(person1.getName()); // Ali
        System.out.println(person1.getCar().getModel()); // BMW
        System.out.println(person2.getName()); // Ali
        System.out.println(person2.getCar().getModel()); // BMW

        person2.setName("Vali");
        person2.getCar().setModel("Mercedes");

        System.out.println(person1.getName()); // Vali
        System.out.println(person1.getCar().getModel()); // Mercedes
        System.out.println(person2.getName()); // Vali
        System.out.println(person2.getCar().getModel()); // Mercedes
        System.out.println(person2);
        System.out.println(person1);
    }
}
