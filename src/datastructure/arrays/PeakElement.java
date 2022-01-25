package datastructure.arrays;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {10, 83, 84, 65, 69, 76, 78, 32, 57, 89};
        int start = 0;
        int end = arr.length - 1;
        System.out.println(peakFinder(arr,start,end));

    }

    static int peakFinder(int[] arr, int start, int end) {
        if (start == end) {
            return start;
        } else if (start + 1 == end) {
            if (arr[start] > arr[end]) {
                return start;
            } else {
                return end;
            }
        } else {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid - 1] > arr[mid]) {
                return peakFinder(arr, start, mid - 1);
            } else if (arr[mid + 1] > arr[mid]) {
                return peakFinder(arr, mid + 1, end);
            }
        }
        return 0;
    }
}

/*
fresh lounge report stem punch learn magic jungle above achieve armed feel
 */