public class fung {

    public static void main(String[] args) {
        fibonacci(2);
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i < num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

}
