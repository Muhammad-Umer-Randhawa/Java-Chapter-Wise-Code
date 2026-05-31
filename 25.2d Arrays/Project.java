public class Project {
    public static void main(String[] args) {
       char[][] telephoneKeypad = {{'1', '2', '3'},
                                   {'4', '5', '6'},
                                   {'7', '8', '9'},
                                   {'*', '#', '0'}};
                                   
       for(char[] row: telephoneKeypad){
        for(char key: row){
            System.out.print(key + " ");
        }
        System.out.println();
       }
    }
}
