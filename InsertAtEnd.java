package ARRAYSDSA;

public class InsertAtEnd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,99,5,66,7,100,7,1000,5,5};
        int n = arr.length;
        int element = 10;
        insert(arr, n, element);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void insert(int arr[] ,int n , int element)
    {
        arr[n - 1] = element;
    }
}
