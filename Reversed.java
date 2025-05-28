import java.util.*;
public class Reversed 
{
    public static void main(String a[])
    {
        String org, rev = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        org = sc.nextLine();
        for(int i = org.length()-1; i>=0; i--)
        {
            rev = rev + (org.toLowerCase().charAt(i));
            
        }
        System.out.println("Reversed String: " +rev);
    }    
}
