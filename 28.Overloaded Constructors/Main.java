public class Main {
    //overloaded contructors = allow a class to have multiple constructors
    //                         with different parameter lists
    public static void main(String[] args) {

        User user1 = new User("John");
        System.out.println("Username: " + user1.username);
        System.out.println("Email: " + user1.email);
        System.out.println("Age: " + user1.age);

        User user2 = new User("Alice", "alice@example.com");
        System.out.println("Username: " + user2.username);
        System.out.println("Email: " + user2.email);
        System.out.println("Age: " + user2.age);

        User user3 = new User("Bob", "bob@example.com", 25);
        System.out.println("Username: " + user3.username);
        System.out.println("Email: " + user3.email);
        System.out.println("Age: " + user3.age);
    }
}