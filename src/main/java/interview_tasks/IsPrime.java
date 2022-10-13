package interview_tasks;

public class IsPrime {
    public static boolean isPrime (int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isArmStrong(int num) {
        int sumOfCubes = 0;
        int b = num;
        while (b > 0) {
            sumOfCubes += (int)Math.pow(b%10, 3);
            b /= 10;
        }
        return sumOfCubes == num;
    }

    public static int reverseNegativeNumber(int num) {
        if (num > 0) num *= -1;
        int reverse = 0;
        while (num != 0) {
            reverse = reverse*10 + num%10;
            num /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(5));
        System.out.println(isPrime(7));

        System.out.println("----------------------------");
        System.out.println(isPrime(10));
        System.out.println(isPrime(6));
        System.out.println("----------------------------");
        System.out.println(isArmStrong(371));
        System.out.println(isArmStrong(344));

        System.out.println(Math.pow(3, 3));


        System.out.println(reverseNegativeNumber(-135));
        System.out.println(reverseNegativeNumber(-567));
        System.out.println(reverseNegativeNumber(-878));
        System.out.println(reverseNegativeNumber(-971));
    }
}
