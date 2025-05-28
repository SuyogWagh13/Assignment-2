import java.util.Scanner;
public class strlen 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("Length of a string is "+ str.length());
    }
}
