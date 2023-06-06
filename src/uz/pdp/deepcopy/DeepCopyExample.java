package uz.pdp.deepcopy;

public class DeepCopyExample {
    public static void main(String[] args) {
        Person person1 = new Person("Ali");
        try {
            Person person2 = (Person) person1.clone();
            System.out.println(person1.getName()); // Ali
            System.out.println(person2.getName()); // Ali

            person2.setName("Vali");
            System.out.println(person1.getName()); // Ali
            System.out.println(person2.getName()); // Vali
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
