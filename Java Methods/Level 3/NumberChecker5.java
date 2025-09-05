public class NumberChecker5 {
    public static boolean isPerfect(int number) {
        if (number <= 0) {
            return false;
        }
        int sumOfDivisors = 1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
                if (i * i != number) {
                    sumOfDivisors += number / i;
                }
            }
        }
        return sumOfDivisors == number;
    }

    public static boolean isAbundant(int number) {
        if (number <= 0) {
            return false;
        }
        int sumOfDivisors = 1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
                if (i * i != number) {
                    sumOfDivisors += number / i;
                }
            }
        }
        return sumOfDivisors > number;
    }

    public static boolean isDeficient(int number) {
        if (number <= 0) {
            return false;
        }
        int sumOfDivisors = 1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
                if (i * i != number) {
                    sumOfDivisors += number / i;
                }
            }
        }
        return sumOfDivisors < number;
    }

    private static long factorial(int n) {
        if (n < 0) {
            return 0;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean isStrong(int number) {
        if (number < 0) {
            return false;
        }
        int originalNumber = number;
        long sumOfFactorials = 0;
        while (number > 0) {
            int digit = number % 10;
            sumOfFactorials += factorial(digit);
            number /= 10;
        }
        return sumOfFactorials == originalNumber;
    }

    public static void main(String[] args) {
        int number1 = 28;
        int number2 = 12;
        int number3 = 8;
        int number4 = 145;

        System.out.println(number1 + " is a perfect number: " + isPerfect(number1));
        System.out.println(number2 + " is an abundant number: " + isAbundant(number2));
        System.out.println(number3 + " is a deficient number: " + isDeficient(number3));
        System.out.println(number4 + " is a strong number: " + isStrong(number4));
        System.out.println();
        
        System.out.println(number1 + " is an abundant number: " + isAbundant(number1));
        System.out.println(number2 + " is a deficient number: " + isDeficient(number2));
        System.out.println(number3 + " is a perfect number: " + isPerfect(number3));
        System.out.println(number4 + " is a perfect number: " + isPerfect(number4));
    }
}
