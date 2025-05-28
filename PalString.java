// palindrpome string using for loop

import java.util.*;
public class PalString 
{
    public static void main(String args[])
    {
        String org, rev= "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        org = sc.nextLine();

        for(int i = org.length()-1; i>=0; i--)
        {
            rev = rev + org.charAt(i);
        }
        if(rev.equals(org))
            System.out.println("The string " +org+ " is a palindrome.");
        else
        System.out.println("The string " +org+ " is not a palindrome.");
    }
}
