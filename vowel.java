import java.util.Scanner;
public class vowel 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int count = 0, cnt = 0;
        for (int i = 0; i < str.length(); i++) 
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
             else
            {
                cnt++;
            }
        }
        System.out.print("Total no of vowels in string are: " + count);
        System.out.print("\nTotal no of consonents in string are: " + cnt);
    }
}