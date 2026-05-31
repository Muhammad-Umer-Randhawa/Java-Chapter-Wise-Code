public class Main{
    public static void main(String[] args){
    // .substring() = A method used to extract a portion of a string---> .substring(start, end).

        String email = "example123@gmail.com";

        // String username = email.substring(0, 10);
        // String domain = email.substring(11, 20);
        // String character = email.substring(10, 11);
        // System.out.println(email);
        // System.out.println(character);

        String username = email.substring(0, email.indexOf('@'));
        String domain = email.substring(email.indexOf('@') + 1);
        System.out.println(username);
        System.out.println(domain);

    }
}