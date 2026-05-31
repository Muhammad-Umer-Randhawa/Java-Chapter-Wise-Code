import java.util.Random; //importing the "Random" class from utility package
public class Main{
    public static void main(String[] args){

        Random random = new Random();

        int number;

        number = random.nextInt(0, 100); //0,100 means give a random number between 0 and 99, other than this it would give any number in the range of -2 billion to +2 billion
        //0 is inclusive and 100 is exclusive
        System.out.println(number);

    }
}