//You will be given a list of strings. You must sort it alphabetically (case-sensitive, and based on the ASCII values of the chars) and then return the first value.
//The returned value must be a string, and have "***" between each of its letters.
//You should not remove or add elements from/to the array.


public class sortAndStar {

    

    public static String addStarFirstStr(String[] s) {
        java.util.Arrays.sort(s);

        return String.join("***",s[0].split(""));
    }

    public static String addStartsAll(String s){
        return String.join("***", s.split(""));
    }

    public static void main(String[] args) {
        // Example usage:
        // Sort the names and return the first one with "***" between each letter
        String[] names = {"John", "Maria", "José", "Ana", "Pedro"};
        System.out.println(addStarFirstStr(names));

        // Print all names with "***" between each letter
        for (String name : names){
            System.out.println(addStartsAll(name));
        }
    }

}