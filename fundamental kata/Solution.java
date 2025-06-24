public class Solution {
    public static String replace(final String s) {
        return s.replaceAll("[aeiouAEIOU]", "!");
    }
    public static void main(String[] args) {
        System.out.println(replace("Hello World")); // Output: H!ll! W!rld
    }
}