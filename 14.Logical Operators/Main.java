public class Main{
    public static void main(String[] args){

        // Logical operators enable us to check more than two conditions simultaneously.
        // && (AND) operator ---> only runs if both conditions are true
        // || (OR) operator ---> can run even if only one condition is true
        // ! (NOT) operator ---> reverses the logical state of its operand

        double temp = -10;
        boolean isSunny = true;
        if(temp <=30 && temp >= 0 && isSunny){
            System.out.println("The weather is good today!!!");
            System.out.println("It is Sunny outside!!!");
        }
        else if(temp <=30 && temp >= 0 && !isSunny){
            System.out.println("It is cloudy outside!!!");
        }
        else if(temp > 30 || temp < 0){
            System.out.println("The weather is bad today!!!");  
        }
    }
}