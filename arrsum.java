import java.util.*;
public class arrsum 
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
            System.out.print("Elements at "+(i + 1)+": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("\nArray elements are: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        int sum = 0;
        for(int i =0; i < n; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println("\nSum of the elements of an array is: "+sum);

    }

}
