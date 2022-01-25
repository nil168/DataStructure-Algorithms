package datastructure.arrays;
import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int[] array1 = {10,1,5,67,89,34,567,23};
        getMinMax(array1);

    }
    static void getMinMax(int[] array){
        /*Arrays.sort(array);
        int min = array[0];
        int max = array[array.length - 1];
        for(int i : array){
            System.out.print(i+" ");
        }
        System.out.println();*/
        int min = array[0];
        int max = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min)
                min = array[i];
            else if(array[i]>max)
                max = array[i];
        }
        System.out.println("The minimum element is : "+min);
        System.out.println("The maximum Element is : "+max);
    }
}
