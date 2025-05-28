import java.util.Scanner;
public class max 
{
    public static void main(String a[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) 
        {
            System.out.print("Element at " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        System.out.println("The elements of an array:");
        for (int i = 0; i < size; i++) 
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int maximum = array[0];
        for (int i = 1; i < array.length; i++) 
        {
            if (array[i] > maximum) 
                maximum = array[i];
        }
        System.out.println("The maximum element is: " +maximum);
    }
}
