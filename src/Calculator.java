import java.util.Scanner;

public class Calculator {
    public static void calculator(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter number of terms");
        double i = input.nextDouble();
        double sum = 0;
        for (i = 0; i < 10000; i++) {
            if (i % 2 == 0)
                sum += -1 / (2 * i - 1);
            else
                sum += 1 / (2 * i - 1);
        }

        System.out.println(sum);


    }

    public void sum() {
        int firstNum = sum(1, 2, 3);
        int secondNum = sum(1, 4, 9);
        System.out.println(firstNum);
        System.out.println(secondNum);
    }

    static int sum(int a, int b, int c) {

        return a + b + c;
    }

    public void product() {
        int firstNum = sum(1, 2, 3);
        int secondNum = sum(1, 4, 9);
        System.out.println(firstNum);
        System.out.println(secondNum);
    }

    static int product(int a, int b, int c) {

        return a * b * c;

    }

    public static int min(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

}

