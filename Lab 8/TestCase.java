class Animal {
    void sound() {
        System.out.println("Siiii");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog Ghew Ghew");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meow meow");
    }
}

public class TestCase {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();

        a.sound();
        d.sound();
        c.sound();
    }
}