import java.util.Scanner;
public class occurence 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.print("Enter the character you want to replace: ");
        char ch = sc.next().charAt(0);

        System.out.print("Enter the replacement character: ");
        char ch1 = sc.next().charAt(0);

        String str2 = str.replace(ch, ch1);
        System.out.print("String after replacement of characters: " + str2);
    }    
}
