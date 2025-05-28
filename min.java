import java.util.Scanner;
public class min 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        int array[] = new int[size];
        System.out.println("Enter array elements: ");
        
        for(int i = 0; i < size; i++)
        {
            System.out.print("Elelment at " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            
        }
        System.out.print("Array elements are: ");
        for(int i = 0; i < size; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int minimum = array[0];
        for(int i = 0; i < size; i++)
        {
            if(array[i] < minimum)
            {
                minimum = array[i];
            }
        }
        System.out.print("The smallest array element is: " + minimum);
    }
}
