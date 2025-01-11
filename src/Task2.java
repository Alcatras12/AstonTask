import java.util.Scanner;


public class Task2
{
    public static void main(String[] args)
    {
        System.out.println("Enter the first line");
        Scanner scanner = new Scanner(System.in);
        String firstlineinput = scanner.nextLine();
        System.out.println("Enter the second line");
        String secondlineinput = scanner.nextLine();

        if(firstlineinput.equals(secondlineinput))
        {
            System.out.println("Строки идентичны");
        }
        else
        {
            System.out.println("Строки неидентичны");
        }
    }
}
