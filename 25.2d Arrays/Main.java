public class Main{
    public static void main(String[] args) {

        // 2d arrays= An array where each element is an array. 
        // Useful for storing a matrix of data

        String[][] groceries = {{"apple", "banana", "cherry"},
                                {"potato", "onion", "carrot"}, 
                                {"chicken", "beef", "lamb"}};
        
        //to change an array element in a 2d array, do following:
        groceries[0][0] = "kiwi"; //the first index implies the row and the second index implies the column.
        groceries[1][1] = "broccoli";
        groceries[2][2] = "fish";

        for(String[] foods: groceries){
            for(String food: foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}