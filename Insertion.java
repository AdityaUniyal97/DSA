package ARRAYSDSA;
public class Insertion {
public static void main(String[] args) 
{
    int[] arr = new int[5];
    int cap = 5;
    int n = 3;
    arr[0] = 5;
    arr[1] = 10;
    arr[2] = 20; 

    System.out.println("Before Insertion - ");
    for(int i = 0 ; i < n ; i ++)
    {
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    
    int x = 7;
    int pos = 2;
    n = insert(arr, n, x, cap, pos);
    System.out.println("After Insertion - ");
    for(int i = 0 ; i < n ; i ++)
    {
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}   

static int insert(int[] arr , int n  , int x , int cap , int pos)
{
    if(n == cap) // if array is full
    return n;

    int index = pos - 1; // index of the element to be shifted
    
    for(int i = n - 1; i >= index ; i--)
    {
        arr[i+1] = arr[i]; // shift the elements to the right
    }

    arr[index] = x; // insert the element at the given position

    return n + 1; // return the size of the array
} 
}
