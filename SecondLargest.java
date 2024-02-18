package ARRAYSDSA;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1 };
        int n = arr.length;
        Second(arr, n);
    }

    static void Second(int arr[] , int n)
    {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        if(n < 2) // there should be atleast 2 elements
        {
        return ; 
        }

        for(int i = 0 ; i < n ; i ++){
            /* If current element is greater than
			first then update both first and second */

            if(arr[i] > first)
            {
                second = first;
                first = arr[i];
            }

            /*
             * If arr[i] is in between first and second then update second
             */

             else if(arr[i] > second && arr[i] != first)
             {
                 second = arr[i];
             }
        }

        if(second == Integer.MIN_VALUE)
        System.out.println("There is no second element ");

        else
        System.out.print("The second largest element in array is "+second);
    }
}
