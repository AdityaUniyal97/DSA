package ARRAYSDSA;

public class LeftRotateArray_by_One {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        rotate(arr, n);

        for(int i = 0 ; i < n; i ++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    static void rotate(int[] arr , int n)
    {
        int temp = arr[0]; // stroing arr first value in temp

        for(int i = 1 ; i < n ; i ++)
        {
          arr[i-1] = arr[i]; //shifting arr[i] to left
        }

        arr[n - 1] = temp; //stroing temp which is array first element to array last
    }
}
