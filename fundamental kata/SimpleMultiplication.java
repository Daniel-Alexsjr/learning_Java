//This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.

public class SimpleMultiplication {
    public static Integer multiplication(int n) {
        return n % 2 == 0 ? n*8 : n*9;
    }
    public static void main(String[] args) {
        System.out.println(multiplication(2));
    }
}