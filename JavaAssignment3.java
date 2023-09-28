import java.util.Arrays;
import java.util.Scanner;

class Solution 
{
    public int[] sortArrayByParity(int[] arr) 
    {
        int start=0,end=arr.length-1,temp;
        while(start < end)
        {
            if(arr[start]%2==0)
            {
                start++;
            }
            else if(arr[end]%2 != 0)
            {
                end--;
            }
            else
            {
                temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        return arr;
    }
}

class JavaAssignment3
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter the Size of Array:- ");
        n=sc.nextInt();
        int[] ans=new int[n];
        System.out.println("Enter the Elements:- ");
        for(int i=0;i<n;i++)
        {
            ans[i]=sc.nextInt();
        }
      Solution obj= new Solution();
      int[] res;
      res=obj.sortArrayByParity(ans);
      System.out.println(Arrays.toString(res));
      sc.close();
    }
}