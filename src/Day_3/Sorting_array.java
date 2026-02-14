package Day_3;

import java.util.Arrays;

public class Sorting_array
{
    public static void main(String[] args)
    {
        int [] arr = {15, 23, 65, 2, 8, 27};
        int n = arr.length;

        int [] result = new int[n];
        int i = 0, j = n -1;

        for(int num : arr)
        {
            if(num % 2 != 0) result[i++] = num;
            else result[j--] = num;
        }
        System.out.println("Sorting the array using new array\n");
        System.out.println("The odd-even sorted array is : " + Arrays.toString(result));

        int left = 0, right = arr.length - 1;
        while(left < right)
        {
            if(arr[left] % 2 != 0) left++;
            else if(arr[right] % 2 == 0) right--;
            else
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        System.out.println("\nSorting the array In-place\n");
        System.out.println("The odd-even sorted array is : " + Arrays.toString(arr));
    }
}
