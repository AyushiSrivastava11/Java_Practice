import java.util.*;
public class Flower
{
    public static void main(String[] args) 
    {
       int[][] flowers={
                        {1,6},
                        {3,7},
                        {9,12},
                        {4,13}
                    };
        int[] people={2,3,7,11};
        FlowersBloomOut obj= new FlowersBloomOut();
        System.out.println(Arrays.toString(obj.fullBloomFlowers(flowers, people)));
    }
}
class FlowersBloomOut {
    static int search(int[] arr, int target)
    {
        int mid,start=0,end=arr.length-1;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(target >= arr[mid])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return (end+1);
    }
    public int[] fullBloomFlowers(int[][] flowers, int[] people)
    {
        int n=flowers.length;
        int[] bloom=new int[n];
        int[] out=new int[n];
        for(int i=0;i<n;i++)
        {
            bloom[i]=flowers[i][0];
            out[i]=flowers[i][1];
        }
        Arrays.sort(bloom);
        Arrays.sort(out);
        int x=people.length;
        int[] result=new int[x];
        for(int i=0;i<x;i++)
        {
            int bloomed=search(bloom,people[i]);
            int bloomedOut=search(out,people[i]-1);
            result[i]=bloomed-bloomedOut;
        }
        return result;
    }
}