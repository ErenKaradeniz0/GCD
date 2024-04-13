import java.util.Scanner;

public class Gcd2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer 1 z+");
        int input = scanner.nextInt();
        System.out.println("Enter integer 2 z+");
        int input2 = scanner.nextInt();
        if (input > 0 && input2 > 0) {
            System.out.println("gcd is " + gcd2(input, input2));
        } else
            System.out.println("Enter positive numbers");
    }

    public static int gcd2(int input1, int input2) {
        if (input1 == 0)
            return input2;
        else if (input2 == 0)
            return input1;
        int[] input1Primes = new int[input1 + 1];
        int[] input2Primes = new int[input2 + 1];
        for (int t = 2; t <= input1; t++) {
            input1Primes[t] = t;
        }
        for (int t = 2; t <= input1; t++) {
            if (input1Primes[t] != 0) {
                int j = t + t;
                while (j <= input1) {
                    input1Primes[j] = 0;
                    j = j + t;
                }
            }
        }
        for (int t = 2; t <= input2; t++) {
            input2Primes[t] = t;
        }
        for (int t = 2; t <= input2; t++) {
            if (input2Primes[t] != 0) {
                int j = t + t;
                while (j <= input2) {
                    input2Primes[j] = 0;
                    j = j + t;
                }
            }
        }

        int[] input1PrimeDivisors = new int[input1 + 1];
        int[] input2PrimeDivisors = new int[input2 + 1];

        int i = 0;
        int index = 0;
        System.out.print(input1 + " = Input1 prime divisors = ");
        while (input1 != 1) {
            if (input1Primes[i] != 0 && input1 % input1Primes[i] == 0) {
                System.out.print(input1Primes[i] + " ");
                input1PrimeDivisors[index] = input1Primes[i];
                index++;
                input1 = input1 / input1Primes[i];
                if (input1 % input1Primes[i] == 0) {
                    i--;
                }
            }
            i++;
        }
        System.out.print("\n");
        i = 0;
        index = 0;
        System.out.print(input2 + " = Input2 prime divisors = ");
        while (input2 != 1) {
            if (input2Primes[i] != 0 && input2 % input2Primes[i] == 0) {
                System.out.print(input2Primes[i] + " ");
                input2PrimeDivisors[index] = input2Primes[i];
                index++;
                input2 = input2 / input2Primes[i];
                if (input2 % input2Primes[i] == 0) {
                    i--;
                }

            }
            i++;
        }
        System.out.print("\n");
        input1 = input1Primes.length-1;
        input2 = input2Primes.length-1;
        int input1i = 0;
        int input2i = 0;
        int gcd = 1;
        while (input1PrimeDivisors[input1i] != 0 && input2PrimeDivisors[input2i] != 0) {
            if (input1PrimeDivisors[input1i] == input2PrimeDivisors[input2i]) {
                gcd *= input1PrimeDivisors[input1i];
                input1i++;
                input2i++;
                continue;
            }
            if (input1 > input2)
                input1i++;
            else
                input2i++;
        }
        return gcd;
    }
}