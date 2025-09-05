public class FactorTasks {
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int greatestFactor(int[] factors) {
        if (factors.length == 0) {
            return 0;
        }
        return factors[factors.length - 1];
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static long productOfCubeOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= (long) Math.pow(factor, 3);
        }
        return product;
    }

    public static void main(String[] args) {
        int number = 12;
        int[] factors = findFactors(number);
        System.out.print("The factors of " + number + " are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        System.out.println("The greatest factor is: " + greatestFactor(factors));
        System.out.println("The sum of the factors is: " + sumOfFactors(factors));
        System.out.println("The product of the factors is: " + productOfFactors(factors));
        System.out.println("The product of the cube of the factors is: " + productOfCubeOfFactors(factors));
    }
}