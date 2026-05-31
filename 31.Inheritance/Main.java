public class Main{
    public static void main(String[] args) {
        // Inheritance = One class inherits the attributes and methods from another class 
        // Child <- Parent
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
}
}