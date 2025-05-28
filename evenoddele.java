import java.util.Scanner;
public class evenoddele 
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print("Element at " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("The array elements are: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }

        int count = 0, cnt = 0;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] % 2 == 0)
            {
                count++;
            }
            if(arr[i] % 2 != 0)
            {
                cnt++;
            }
        }
        System.out.print("\nThere are total " + count + " even numbers and " + cnt + " odd numbers in the array.");
    }
}
