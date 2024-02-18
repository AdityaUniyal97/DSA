package ARRAYSDSA;
public class Deltion 
{
    public static void main(String[] args) 
    {
        int[] arr = {3,8,12,5,6};
        int n = 5;
        int x = 12;

        System.out.println("Before Deletion - ");
        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        n = delete(arr, n, x);
        System.out.println("After Deletion - ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int delete(int[] arr , int n , int x)
    {
        int i = 0;
        for(i = 0 ; i < n ; i ++)
        {
            if(arr[i] == x)
            break; // break loop if the element is found
        }

        if(i == n) // if element is not found i reached to last n
        return n;

        for(int j = i ; j < n - 1; j++) // shift the elements to the left to fill the space of deleted element
        {
            arr[j] = arr[j+1]; // {1,2,_,4,} after shifting {1,2,4,_} space come to last

        }
        return n - 1;
    }
}