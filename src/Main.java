public class Main {
    /*
        Каждое последующее число = сумма двух предыдущих
     */
    public static void main(String[] args) {
        System.out.println("Rec");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacciRec(i) + " ");
        }

        System.out.println("\nNo rec");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacciNoRec(i) + " ");
        }
    }

    private static int fibonacciRec(int n) {
        if (n == 0 || n == 1) return 1;
        return fibonacciRec(n - 1) + fibonacciRec(n - 2);
    }

    private static int fibonacciNoRec(int n) {
        if (n == 0) {
            return 1;
        }

        int prev = 1;
        int current = 1;

        for (int i = 2; i <= n; ++i) {
            int tmp = current;
            current += prev;
            prev = tmp;
        }

        return current;
    }


}
