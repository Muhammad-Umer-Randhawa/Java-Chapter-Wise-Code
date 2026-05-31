public class Main {
    public static void main(String[] args) {

        String name = "John Doe";

        //int length = name.length(); //gives the length of the string
        //char letter = name.charAt(0); //gives the specified character of the string
        //int index = name.indexOf(" "); //gives the index of the first occurrence of the specified character. indexOf() gives the first index of that character
        //int lastIndex = name.lastIndexOf("o"); //gives the index of the last occurrence of the specified character. lastIndexOf() gives the last index of that character
        //System.out.println(length);

        //name = name.toLowerCase(); //converts the string to lowercase
        //name = name.toUpperCase(); //converts the string to uppercase
        //name = name.trim(); //removes leading and trailing whitespace
        //name = name.replace("o", "a"); //replaces a specified character with another character

        //System.out.println(name.isEmpty()); //checks if the string is empty
        //System.out.println(name.contains(" ")); //checks if the string contains a character.
        //System.out.println(name.equals("John Doe")); //checks if the string is equal to the specified string
        System.out.println(name.equalsIgnoreCase("john doe")); //checks if the string is equal to the specified string, ignoring case
    }
}
