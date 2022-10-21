// package HomeWork.home_work_2;

public class Task_02 {
    public static void main(String[] args) {
        double x = 0.00001;
        int n = 2147483647;
        double result = myPow(x, n);
        System.out.println(result);
    }

    public static double myPow(double x, int n) {
        if (n < 0) {
            return 1 / (x * myPow(x, -n - 1));
        }
        if (n == 0)
            return 1;
        if (x == 0 || x == 1)
            return x;
        if (n == 1)
            return x;
        if (n % 2 != 0) {
            return x * myPow(x * x, n / 2);
        }

        return myPow(x * x, n / 2);

    }
}
