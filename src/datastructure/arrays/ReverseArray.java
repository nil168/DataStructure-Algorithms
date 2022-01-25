package datastructure.arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array1 = {10,1,5,67,89,34,567,23};
        System.out.println("Array:");
        for(int element : array1) {
            System.out.print(element+" ");
        }
        reverseArray(array1);
        System.out.println("\nReversed Array:");
        for(int element : array1) {
            System.out.print(element+" ");
        }
    }
    static void reverseArray(int[] array){
        for(int i = 0; i < array.length/2; i++){
            int storedElement = array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i] = storedElement;
        }
    }
}
