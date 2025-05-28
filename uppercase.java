import java.util.Scanner;
public class uppercase 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("String after converting to uppercase is " + str.toUpperCase());
    }
}
