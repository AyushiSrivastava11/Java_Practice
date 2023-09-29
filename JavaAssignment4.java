//Coding implementation of inserting an element at the end:
import java.util.*;
class JavaAssignment4
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
        for(int beforeInsert : obj.nums)
        {
            System.out.print(beforeInsert + " ");
        }
        System.out.println("\nEnter the key you want to enter:- ");
        int key=sc.nextInt();
        System.out.println("Enter the Capacity!");
        int capacity=sc.nextInt();
        n=Solution.insertSorted(obj.nums,n,key,capacity);
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
    static int insertSorted(int[] arr, int n,int key,int capacity)
    {
       if(n >= capacity)
       {
        return n;
       }
       else
       {
        arr[n]=key;
       }
       return (n+1);
    }
}