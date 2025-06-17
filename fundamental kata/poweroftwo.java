public class poweroftwo {
    public static void main(String[] args) {
        int n = 3;
        int w = 2;
        


        for (int i = 0; i <= n; i++) {
            int result = (int) Math.pow(w, i);
            System.out.println("2^" + i + " = " + result);
        }
        System.out.println("2^" + n + " = " + (int) Math.pow(w, n));
        
    }
}
