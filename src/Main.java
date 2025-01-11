import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
    }

    public static void Task1() {
        System.out.println("Enter 2 numbers separated by a space");

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        Double num1 = Double.parseDouble(numbers[0]);
        Double num2 = Double.parseDouble(numbers[1]);

        DecimalFormat df = new DecimalFormat("0.##");

        if (num1 > num2) {
            System.out.println(df.format(num1) + " > " + df.format(num2));
        } else if (num1 < num2) {
            System.out.println(df.format(num1) + " < " + df.format(num2));
        } else {
            System.out.println(df.format(num1) + " = " + df.format(num2));
        }

        System.out.println(df.format(num1) + " + " + df.format(num2) + " = " + df.format(num1 + num2) + "\n"
                + df.format(num1) + " - " + df.format(num2) + " = " + df.format(num1 - num2) + "\n"
                + df.format(num1) + " * " + df.format(num2) + " = " + df.format(num1 * num2) + "\n"
                + df.format(num1) + " / " + df.format(num2) + " = " + df.format(num1 / num2) + "\n");
    }

    public static void Task2() {
        System.out.println("Enter the first line");
        Scanner scanner = new Scanner(System.in);
        String firstlineinput = scanner.nextLine();
        System.out.println("Enter the second line");
        String secondlineinput = scanner.nextLine();

        if (firstlineinput.equals(secondlineinput)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }

    public static void Task3() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}