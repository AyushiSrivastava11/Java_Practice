import java.util.*;
public class JavaAssignment8
{
    public static void main(String[] args) 
    {
        int n;
        // int[] arr= new int[];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size:-");
        n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter Elements:-");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        MinimumConsecutive obj= new MinimumConsecutive();
        System.out.println("Answer is "+obj.minimumCardPickup(arr));
        sc.close();
    }
}
class MinimumConsecutive{
    public int minimumCardPickup(int[] cards)
    {
    // //   Map <Integer,Integer> checkingHash= new HashMap<Integer,Integer>();
    // //   int start=0,end=0,ans=Integer.MAX_VALUE;
    // //   boolean checked=false;
    // //   while(end < cards.length)
    // //   {
    // //       Integer point=checkingHash.get(cards[end]);
    // //       if(point == null)
    // //       {
    // //           checkingHash.put(cards[end],end);
    // //       }
    // //       else
    // //       {
    // //           while(cards[start] != cards[end])
    // //           {
    // //            checkingHash.remove(cards[start]);
    // //            start++;  
    // //           }
    // //            ans=Math.min(ans,(end-start)+1);
    // //            System.out.print(ans);
    // //               checked=true;
    // //               checkingHash.put(cards[start],end);
    // //               start++;
    // //       }
    // //       end++;
    // //   }
    //   return (!checked)?-1:ans;
    // boolean[] checked= new boolean[1000001]; //all are intially false
    // boolean present=false;
    // int start=0,ans=Integer.MAX_VALUE,n=cards.length;
    // for(int end=0;end<n;end++)
    // {
    //     if(checked[cards[end]])
    //     {
    //         while(cards[start] != cards[end])
    //         {
    //             checked[cards[start]]=false;
    //             start++;
    //         }
    //         ans=Math.min(ans,(end-start+1));
    //         present=true;
    //         start++;
    //     }
    //     else
    //     {
    //         checked[cards[end]]=true;
    //     }
    // }
    
    // return (present)?ans:-1;
    boolean[] checked= new boolean[1000001]; //all are intially false
    int start=0,ans=Integer.MAX_VALUE;
    boolean goneThrough=false;
   for(int end=0;end<cards.length;end++)
   {
    if(checked[cards[end]])
    {
        while(cards[start] != cards[end])
        {
            checked[cards[start]]=false;
            start++;
        }
        ans=Math.min(ans,(end-start+1));
        goneThrough=true;
        start++;
    }
    else{
        checked[cards[end]]=true;
    }
   }
   return (goneThrough)?ans:-1;
    }
}
