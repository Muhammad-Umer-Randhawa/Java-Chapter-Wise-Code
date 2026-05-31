public class Main{
    public static void main(String[] args) {
        // static = Makes a variable or method belong to the class rather than to any
        //          specific object. Commonly used for utility methods or shared resources.

        Friends friend1 = new Friends("Jim");
        Friends friend2 = new Friends("Pam");
        Friends friend3 = new Friends("Dwight");
        Friends.displayFriends();

        // System.out.println(Friends.numOfFriends);// this will display 1
        // System.out.println(Friends.numOfFriends);// this should display 2 but it also displays 1. 
                                                 // Why? because each friend object has its own copy of numOfFriends.
                                                 // we can make all friend objects share the same numOfFriends counter
                                                 // by using the modifier static.
        //another exampleof using static specifier is the Math class, for example;
        Math.round(3.99);
        //when using math class, we dont create and object of the math class,
        //we just directly use the method round() with the class name using a dot operator, 
        //this means that the round() method is static in Math class.
    }
}