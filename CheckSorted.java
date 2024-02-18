package ARRAYSDSA;


public class CheckSorted {
    public static void main(String[] args) {
       int[] arr = {10,20,20,30};
       int n = arr.length;
       boolean result = isSorted(arr, n);
       System.out.println(result);
    }

    static boolean isSorted(int arr[] , int n)
    {
        for(int i = 1 ; i < n ; i ++)
        {
            if(arr[i] < arr[i-1]) // if the element is less than previous element
            {
                return false;
            }
        }
        return true;
    }
}
