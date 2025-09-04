public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("James", 25);
        Person p2 = new Person(p1);

        System.out.println("Original: " + p1.name + " - " + p1.age);
        System.out.println("Copy: " + p2.name + " - " + p2.age);
    }
}
