package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println("Unsorted Array: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    static void insertionSort(int[] arr){
        for(int i=1; i < arr.length; i++){
            int temp = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
}
