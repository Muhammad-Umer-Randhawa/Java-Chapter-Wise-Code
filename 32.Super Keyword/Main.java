public class Main{
    public static void main(String[] args){
        //super = Refers to the parent class (subclass <- superclass).
        //        Used in constructors and method overriding. 
        //        Calls the parent constructor to initialize attributes.

        Person person = new Person("John", "Doe");
        person.showName();

        Student student = new Student("John", "Doe", 3.7);
        student.showDetails();
    }
}