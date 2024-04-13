import java.util.Scanner;

public class Gcd1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer 1 z+");
        int input = scanner.nextInt();
        System.out.println("Enter integer 2 z+");
        int input2 = scanner.nextInt();
        if (input >= 0 && input2 >= 0) {
            System.out.println(gcd1(input, input2));
        } else
            System.out.println("Enter positive numbers");
    }

    public static int gcd1(int input1, int input2) {
        if (input1 == 0)
            return input2;
        else if (input2 == 0)
            return input1;
        int t = input2;
        if (input1 < input2)
            t = input1;

        while (t > 0) {
            if (input1 % t == 0) {
                if (input2 % t == 0) {
                    return t;
                }
            }
            t--;
        }
        return 1;
    }
}