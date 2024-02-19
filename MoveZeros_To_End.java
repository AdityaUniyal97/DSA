package ARRAYSDSA;

public class MoveZeros_To_End {
    public static void main(String[] args) {
        int[] arr = {1,0,20,3,0,4,0,0,0,8,0,0};
        move(arr, 0);
        for(int i = 0 ; i < arr.length ; i ++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void move(int[] arr , int n)
    {
         n = arr.length;
        int count = 0;

        for(int i = 0 ; i < n ; i ++)
        {

            if(arr[i] != 0) // if the element is not zero than go inside
            {
                int temp = arr[i]; // swapping non zero element with arr[count]
                arr[i] = arr[count];// arr[count] will increse only when it found non zero element
                arr[count] = temp;// so will swap the non zero element with arr[count] 

                count++;
            }
        }
    }
}
