package ARRAYSDSA;

public class LargestIndex {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,99,5,66,7,100,7,1000,5,5};
        int result = max(arr);
        System.out.println(result);
    }

    static int max(int[] arr)
    {
        int n = arr.length;

        int max = 0;

        for(int i = 1 ; i < n ; i++)
        {
            if(arr[i] > arr[max])
            {
                max = i;
            }
        }
        return max;
    }
}
