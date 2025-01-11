import java.text.DecimalFormat;
import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Enter 2 numbers separated by a space");

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        Double num1 = Double.parseDouble(numbers[0]);
        Double num2 = Double.parseDouble(numbers[1]);

        DecimalFormat df = new DecimalFormat("0.##");

        if (num1 >  num2)
        {
            System.out.println(df.format(num1) + " > " + df.format(num2));
        }
        else if (num1 < num2)
        {
            System.out.println(df.format(num1) + " < " + df.format(num2));
        }
        else
        {
            System.out.println(df.format(num1) + " = " + df.format(num2));
        }

        System.out.println(df.format(num1) + " + " + df.format(num2) + " = " + df.format(num1 + num2) +"\n"
                + df.format(num1) + " - " + df.format(num2) + " = " + df.format(num1 - num2) +"\n"
                + df.format(num1) + " * " + df.format(num2) + " = " + df.format(num1 * num2) +"\n"
                + df.format(num1) + " / " + df.format(num2) + " = " + df.format(num1 / num2) +"\n");
        }
    }
