import java.util.Scanner;
public class merge 
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of first array: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print("Element at [1, " + (i + 1) + "]: ");
            arr1[i] = sc.nextInt();
        }

        System.out.print("\nEnter the size of second array: ");
        int m = sc.nextInt();
        int arr2[] = new int[m];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < m; i++)
        {
            System.out.print("Element at [2, " + (i + 1) + "]: ");
            arr2[i] = sc.nextInt();
        }

        System.out.print("\nThe elements of the first array are: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\nThe elements of the second array are: ");
        for(int i = 0; i < m; i++)
        {
            System.out.print(arr2[i] + " ");
        }

        int merged[] = new int[n + m];
        for(int i = 0; i < n; i++)
        {
            merged[i] = arr1[i];
        }
        for(int i = 0; i < m; i++)
        {
            merged[n + i] = arr2[i];
        }
        System.out.print("\n\nArray after merged: ");
        for(int i = 0; i < merged.length; i++)
        {
            System.out.print(merged[i]+ " ");
        }
    }
}
