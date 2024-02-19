package ARRAYSDSA;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {10,20,30,30,30,40,40,50,50,60,70,70};
        int n = arr.length;
        n = remDup(arr, n);
        System.out.println("After Removal - ");
        for(int i = 0 ; i < n ; i ++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int remDup(int[] arr , int n)
    {
        int res = 1; // count of non-duplicate elements

        for(int i = 1 ; i < n ; i ++)
        {
            if(arr[res - 1] != arr[i]) // if arr[res-1] is not equal to arr[i] than go inside
            {
                arr[res] = arr[i]; // copy the not same element in to new array
                res++; // increment to check for all the values
            }
        }
        return res; // return the count of non-duplicate elements
    }
}
