package Day_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Nth_Largest
{
    public static void main(String [] args)
    {
        int [] arr = {25, 34, 65, 74, 24, 16, 32, 8, -19, -13};

         Arrays.sort(arr);
         int n = 2;
         int index = arr.length - n;

         System.out.println("The largest value your looking for " + arr[index]);

         int max=0, idx;
         for(int i=0; i<n; i++)
         {
             max = Integer.MIN_VALUE;
             idx = -1;
             for(int j=0; j< arr.length; j++)
             {
                 if(max < arr[j])
                 {
                     max = arr[j];
                     idx = j;
                 }
             }
             arr[idx] = Integer.MIN_VALUE;
         }

        System.out.println("The largest value your looking for " + max);
    }
}
