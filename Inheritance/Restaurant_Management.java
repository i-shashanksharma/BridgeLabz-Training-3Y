public class Restaurant_Management {
    public static void main(String[] args) {
        Worker chef = new Chef("Alice", 101);
        Worker waiter = new Waiter("Bob", 202);

        chef.performDuties();
        waiter.performDuties();
    }
}

class Person {
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

interface Worker {
    void performDuties();
}

class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef -> " + name + " (ID: " + id + ") is cooking delicious meals.");
    }
}

class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter -> " + name + " (ID: " + id + ") is serving customers.");
    }
}
