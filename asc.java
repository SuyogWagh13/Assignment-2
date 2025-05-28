import java.util.Scanner;
public class asc 
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

        int temp;
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("\nAscending array is: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
