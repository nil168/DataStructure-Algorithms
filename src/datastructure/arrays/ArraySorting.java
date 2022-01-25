package datastructure.arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] array1 = {10,1,5,67,89,34,567,23};
        System.out.println("Un-Sorted Array:");
        for(int element : array1) {
            System.out.print(element+" ");
        }
        sortArray(array1);
        System.out.println("\nSorted Array:");
        for(int element : array1) {
            System.out.print(element+" ");
        }
    }

    static void sortArray(int[] array){
        int n = array.length;
        int temp;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(array[j-1] > array[j]){
                    //swap elements
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    /*int storedElement =0;
        for(int k=1;k<array.length-1;k++){
            for(int i=1;i<array.length-1;i++){
                if(array[i] < array[i-1]){
                    storedElement = array[i-1];
                    array[i-1]=array[i];
                    array[i] = storedElement;
                } else if(array[i]>array[i+1]){
                    storedElement=array[i];
                    array[i] = array[i+1];
                    array[i+1] = storedElement;
                }
            }
        }
        System.out.println("sorted array is :");
        for(int element : array){
            System.out.print(element+" ");
        }
    }*/
}
