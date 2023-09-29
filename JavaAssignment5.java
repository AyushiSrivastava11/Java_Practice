//Coding implementation of inserting an element at the end:
import java.util.*;
class JavaAssignment5
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size :-");
        int n=sc.nextInt();
        Solution obj= new Solution();
        obj.nums=new int[n+1];
        System.out.println("Enter the Elements:-");
        for(int i=0;i<n;i++)
        {
            obj.nums[i]=sc.nextInt();
        }
       
        System.out.println("Before Insertion:-");
        for(int beforeDel : obj.nums)
        {
            System.out.print(beforeDel + " ");
        }
        System.out.println("\nEnter the key you want to delete:- ");
        int key=sc.nextInt();
        // System.out.println("Enter the Capacity!");
        // int capacity=sc.nextInt();
        n=Solution.deleteElement(obj.nums,n,key);
        System.out.println("After Insertions:");
        for(int i=0;i<n;i++)
        {
            System.out.print(obj.nums[i] + " ");
        }
         sc.close();
    }
}

class Solution
{
    int[] nums;
 static int findElement(int arr[], int n, int key)
    {
        int i;
        for (i = 0; i < n; i++)
            if (arr[i] == key)
                return i;
 
        return -1;
    }
 
    // Function to delete an element
    static int deleteElement(int arr[], int n, int key)
    {
        // Find position of element to be
        // deleted
        int pos = findElement(arr, n, key);
 
        if (pos == -1) {
            System.out.println("Element not found");
            return n;
        }
 
        // Deleting element
        int i;
        for (i = pos; i < n - 1; i++)
            arr[i] = arr[i + 1];
 
        return n - 1;
    }
 
}