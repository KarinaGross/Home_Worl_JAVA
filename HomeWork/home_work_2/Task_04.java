public class Task_04 {

    public static void main(String[] args) {
        int n = 7;
        int result = climbStairs(n);
        System.out.println(result);
    }


    public static int climbStairs(int n) {
        int mem[] = new int[n + 1];
        return climbStairsHelper(n, mem);
    }
    
    public static int climbStairsHelper(int n, int mem[]) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (mem[n] > 0) {
            return mem[n];
        }
        mem[n] = climbStairsHelper(n - 1, mem) + climbStairsHelper(n - 2, mem);
        return mem[n];
    }
}
