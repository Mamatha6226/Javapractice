package Javapractice;

import java.util.Arrays;

public class DeletingArrayElement {
    public static int[] deletion(int [] arr, int element){
        int index = 0;
        int [] newarr = new int[arr.length - 1];
        for(int i = 0; i<arr.length;i++){
            if(arr[i] != element) {
                newarr[index] = arr[i];
                index++;
            }
        }
        return newarr;
    }

    public static void main(String args[]){
        int [] arr = { 2, 4, 1, 7, 8};
        int element = 1;
        int [] newarr = deletion(arr, element);
        System.out.println("original array is: " + Arrays.toString(arr));
        System.out.println("new array is: " + Arrays.toString(newarr));
    }

}
