public class Main{
    public static void main(String[] args) {
        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;
        if(isStudent){
            if (isSenior) {
                System.out.println("You get a student and senior discount of 15%");
                price *= 0.85;
            }
            else{
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }
        }
        else{
            if(isSenior){
                System.out.println("You get a senior discount of 5%");
                price *= 0.95;
            }
            else{
                price *= 1;
            }
        }
        System.out.printf("The final price is: $%.2f", price);
    }
}