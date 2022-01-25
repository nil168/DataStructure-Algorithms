package datastructure.arrays;

import java.util.*;


public class UnionIntersection {
    public static void main(String[] args) {
        int[] array1 = {10,1,5,67,89,34,567,23,1,12,45,1,67,23,1,24,56,1,78,90,84};
        int[] array2 = {10,1,5,67,89,34,567,23,1,12,45,1,67,23,1,24,56,1,87,65,92,80,45,43};
        Arrays.sort(array1);
        Arrays.sort(array2);
        union(array1, array2);
        intersection(array1, array2);

    }
    static void union(int[] array1, int[] array2){
        HashSet<Integer> unionArray = new HashSet<>();
        for (int j : array1) {
            unionArray.add(j);
        }
        for (int j : array2) {
            unionArray.add(j);
        }
        System.out.print(unionArray);
        System.out.println("\n"+unionArray.size());
    }
    static void intersection(int[] array1, int[] array2){
        HashSet<Integer> hs1 =  new HashSet<>();
        for (int j : array1) {
            hs1.add(j);
        }
        HashSet<Integer> hs2 = new HashSet<>();
        for (int j : array2) {
            if (hs1.contains(j)) {
                hs2.add(j);
            }
        }
        System.out.println();
        System.out.print(hs2);
    }
}
