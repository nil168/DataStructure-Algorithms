package datastructure.arrays;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] array1 = {10,1,5,67,89,34,567,23,1,12,45,1,67,23,1,24,56,1};
        int sum = 16;
        findSubArray(array1,sum);
    }
    static void findSubArray(int[] array, int sum){
        int currentSum;
        for(int i = 0;i<array.length;i++){
            currentSum= array[i];
            for(int j=i+1;j<=array.length;j++){
                if(currentSum==sum){
                    System.out.println("Sub Array found");
                    return;
                }
                if(currentSum>sum || j == array.length){
                    break;
                }
                currentSum = currentSum + array[j];
            }
        }
        System.out.println("No sub Array found");
    }
}
