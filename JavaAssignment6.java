import java.util.*;
public class JavaAssignment6 {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:-");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter Elements:-");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean ans=find132pattern(arr);
        System.out.println(ans);
        sc.close();
    }
    static boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int third = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < third) return true;
            while (!stack.isEmpty() && stack.peek() < nums[i]) {
                third = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
}
