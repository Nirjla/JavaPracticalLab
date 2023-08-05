// 9.	Provide an example on method overriding condition (dynamic or run time polymorphism)
// 5.	Provide example on dynamic method dispatch
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

public class DynamicMethod {
    public static void main(String[] args) {
        Animal animalObj1 = new Cat();
        Animal animalObj2 = new Dog();

        animalObj1.makeSound(); // Dynamic method dispatch - calls the makeSound method of the Cat class
        animalObj2.makeSound(); // Dynamic method dispatch - calls the makeSound method of the Dog class
    }
}