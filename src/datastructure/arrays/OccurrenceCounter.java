package datastructure.arrays;

public class OccurrenceCounter {
    public static void main(String[] args) {
        int[] array1 = {10,1,5,67,89,34,567,23,1,12,45,1,67,23,1,24,56,1};
        int n = 23;
        occurrenceCounter(array1,n);
    }
    static void occurrenceCounter(int[] array, int n){
        int count = 0;
        for (int j : array) {
            if (n == j)
                count = count + 1;
        }
        System.out.println("The total occurrence of "+n+" is: "+count+" times");
    }
}
