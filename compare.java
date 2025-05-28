import java.util.Scanner;
public class compare
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        //System.out.print(str1.compareTo(str2));
        if(str1.equals(str2)) 
        {
            System.out.println("Both strings are equal.");
        } 
        else 
        {
            System.out.println("Strings are not equal.");
        }
    }
}