package Arrays;
import java.util.*;
public class SwapArray {

    public static void swap (int[] arr,int i,int j){
        int temp = arr [i];
        arr [i] = arr [j];
        arr [j] = temp;
    }
    public static void main(String[] args){
        int[] arr;
        arr = new int [5];
        arr [0] = 12;
        arr [1] = 23;
        arr [2] = 34;
        arr [3] = 45;
        arr [4] = 56;

        swap (arr, 0, 2);
        for (int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
