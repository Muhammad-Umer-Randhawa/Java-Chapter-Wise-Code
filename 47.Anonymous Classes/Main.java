public class Main{
    public static void main(String[] args){
        //  Anonymous class =  A class that doesnt have a name. Cannot be reused.
        //  It is used to instantiate classes that may not be reused elsewhere.
        //  It is defined and instantiated in a single statement.
        //  Add custom behaviour without having to create a new class.
        // Often used for one time uses (Timertasks, Runnable interfaces, Callbacks)
        
        Dog dog = new Dog();
        dog.speak();
        // TalkingDog talkingDog = new TalkingDog(); //we had to create an entirely new class for just one object.instead of dong this create an anonymous class
        Dog talkingDog = new Dog(){
            @Override
            public void speak(){
                System.out.println("Woof! I can talk!");
            }
        };
        talkingDog.speak();
    }
}