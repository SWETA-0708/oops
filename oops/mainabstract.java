abstract class Animal {
    abstract void makeSound(); // Abstract method
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}

public class mainabstract {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound(); // Outputs: Woof!
        cat.makeSound(); // Outputs: Meow!
    }
}




