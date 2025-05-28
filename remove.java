import java.util.Scanner;

public class remove 
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

        int temp[] = new int[size];
        int newsize = 0;
        boolean found = false;
        for(int i = 0; i < size; i++)
        {
            boolean isDuplicate = false;
            for(int j = 0; j < newsize; j++)
            {
                if(array[i] == array[j])
                {
                    found = true;
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate)
            {
                temp[newsize] = array[i];
                newsize++;
            }
        }
        if(found)
        {
            System.out.print("\nArray after removing duplicate elements: ");
            for(int i = 0; i < newsize; i++)
            {
                System.out.print(array[i] + " ");
            }
        }
        else
            System.out.println("There are no duplicate elements in an array.");
    }
}
