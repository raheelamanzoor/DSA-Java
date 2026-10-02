package Arrays;
import java.io.*;
import java.util.*;
public class SpanOfArray {
    public static void main(String[] args) {
        int [] arr;

        arr = new int [5];
        arr [0] = 12;
        arr [1] = 23;
        arr [2] = 34;
        arr [3] = 45;
        arr [4] = 56;

        System.out.println(arr.length);
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }

    }
}
