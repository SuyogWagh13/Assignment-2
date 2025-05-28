import java.util.Scanner;
public class revarr
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

        int n=array.length;
        System.out.println("Reversed array is: ");
        for(int i = n-1; i >= 0; i--)
            System.out.print(array[i]+" "); 
    }
}