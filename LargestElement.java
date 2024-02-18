package ARRAYSDSA;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {3,8,12,5,6};
        int result = largest(arr);
        System.out.println(result);
     }

    static int largest(int[] arr)
    {
        int max = arr[0];

        for(int i = 1 ; i < arr.length ; i++)

        if(arr[i] > max) // if the element is greater than max then update max
        {
        max = arr[i];
        }

        return max; // return the max element

    }
}
