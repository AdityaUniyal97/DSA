package ARRAYSDSA;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        System.out.println("Beofre reverse - ");
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        reverse(arr , 0 , n - 1);
        System.out.println("After reverse - ");
        for(int i = 0 ; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void reverse(int[] arr , int start , int end)
    {
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

}
