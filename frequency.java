import java.util.Scanner;
public class frequency 
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        String str2 = str.replace(" ", "");
        char[] ch = str2.toCharArray();
        boolean[] visited = new boolean[ch.length];
        System.out.println("Frequency of characters: ");
        for(int i = 0; i < ch.length; i++)
        {
            if(visited[i])
                continue;
            int count = 1;
            for(int j = i + 1; j < ch.length; j++)
            {
                if(ch[i] == ch[j])
                {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println("'" + ch[i] + "' : " + count);
        }
    }
}
