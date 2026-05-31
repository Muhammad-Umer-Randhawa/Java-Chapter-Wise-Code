public class Friends {
    
    static int numOfFriends;
    String name;

    Friends(String name){
        this.name = name;
        numOfFriends++;
    }

    //we can also create static methods, when creating static methods we dont use this.;
    static void displayFriends(){
        System.out.println("You have " + numOfFriends + " total friends");
    }
}
