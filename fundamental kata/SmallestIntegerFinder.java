public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        java.util.Arrays.sort(args);
        return args[0];
    }
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 4};
        System.out.println(findSmallestInt(numbers)); // Output: 1
    }
}