public class Task_03 {
    public static void main(String[] args) {
        int n = 3;
        boolean result = isPowerOfTwo(n);
        System.out.println(result);
    }

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        if (n == 1 || n == 2) return true;
        if (n % 2 != 0) return false;
        
        return isPowerOfTwo(n/2);
    }
}
