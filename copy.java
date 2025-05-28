import java.util.*;
public class copy 
{
    public static void main(String a[])
    {
        int arr[] = {10, 20, 30, 40, 50};
        System.out.print("Original array: ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        int arr2[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            arr2[i] = arr[i];
        }
        System.out.print("\nCopied array: ");
        for(int i = 0; i < arr2.length; i++)
        {
            System.out.print(arr2[i] + " ");
        }
    }
}
