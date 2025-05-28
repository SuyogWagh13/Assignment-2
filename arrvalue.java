import java.util.*;
public class arrvalue 
{
    public static void main(String args[])
    {
        int[] arr = {6, 4, 15, 8, 7};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element you want to search: ");
        int element = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < arr.length; i++)
        {
            if(element == arr[i])
            {
                found = true;
                break;
            }
        }
        if(found)
            System.out.println("Array contains the element " + element +".");
        else    
            System.out.println("Array does not contains the element " + element + ".");
    }
}
