class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void bark() {
        System.out.println("Woof woof!");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void meow() {
        System.out.println("Meow meow!");
    }
}

public class Animals {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        dog.eat();
        dog.sleep();
        dog.bark();

        Cat cat = new Cat("Whiskers",5);
        cat.eat();
        cat.sleep();
        cat.meow();
    }
}






