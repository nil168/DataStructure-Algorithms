package datastructure.arrays;

import static datastructure.arrays.ArraySorting.sortArray;

public class KthPlaceSmallestLargest {
    public static void main(String[] args) {
        int[] array1 = {10,1,5,67,89,34,567,23};
        int k = 2;
        kthPlaceSmallestLargest(array1,k);
    }

    static void kthPlaceSmallestLargest(int[] array, int k){
        sortArray(array);
        System.out.println("The "+k+" place largest number is "+array[array.length-k]);
        System.out.println("The "+k+" place smallest number is "+array[k-1]);

    }
}
