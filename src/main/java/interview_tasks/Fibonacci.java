package interview_tasks;

public class Fibonacci {
    public int fib(int n) {
        if (n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }

    public int fib2 (int n) {
        int[] arr = new int[n+2];
        arr[0] = 0; arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr[n];
    }


}
