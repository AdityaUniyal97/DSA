package ARRAYSDSA;

public class Leader_in_Arra {
 public static void main(String[] args) {
    int[] arr = {16,17,4,3,5,2};
    int n = arr.length;
    print(arr, n);
 }  
 
 static void print(int[] arr , int n)
 {
    int max = arr[n-1]; // max will store the last element of array

    System.out.println(max+" "); // printing the last element of array which is inside max

    for(int i = n - 2 ; i >= 0 ; i--) //running loop from 2nd last because in arr[n-1] is already in max
    {
        if(max < arr[i]) // if max is less than arr[i] than max will store arr[i]
        {
            max = arr[i];
            System.out.print(max+" ");
        }
    }
 }
}
