package ARRAYSDSA;

public class LeftRotateArray_by_d {
    public static void main(String[] args) {
    
    int[] arr = {1,2,3,4,5,6};
    int n = 5;
    int d = 2;

    leftRotate(arr , d , n);
    for(int i = 0 ; i < n ; i ++)
    {
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}

static void leftRotate(int[] arr , int d , int n)
{
    reverse(arr , 0, d - 1);
    reverse(arr , d , n - 1);
    reverse(arr , 0 , n - 1);
}
static void reverse(int[] arr , int low , int end)
{
    while(low < end)
    {
        int temp = arr[low];
        arr[low] = arr[end];
        arr[end] = temp;

        low++;
        end--;
    }
}
}