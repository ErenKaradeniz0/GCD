import java.util.Scanner;

public class Gcd3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer 1 z+");
        int input = scanner.nextInt();
        System.out.println("Enter integer 2 z+");
        int input2 = scanner.nextInt();
        if (input >= 0 && input2 >= 0) {
            System.out.println("gcd is " + gcd3(input, input2));
        } else
            System.out.println("Enter positive numbers");
    }

    public static int gcd3(int input1, int input2) {
        if(input2>input1){
            int temp = input1;
            input1 = input2;
            input2 = temp;
            //make input1 > input2
        }
        while (input1 != 0){
            int j = input1 % input2;
            input1 = input2;
            input2 = j;
            if(input2 ==0){
                return input1;
            }
        }
        return input1;
    }
}