import java.util.Scanner;
public class whitespace 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        String str2 = str.replace(" ", "");
        System.out.print("String after removing the spaces: " + str2);
    }
}
