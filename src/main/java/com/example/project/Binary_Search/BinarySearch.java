package com.example.project.Binary_Search;

public class BinarySearch {
    // implements binary search on the elements list for target,
    // and returns the index at which the target is found, or -1 if
    public static int binarySearch(int[] elements, int target) {
        int leftIdx = 0; 
        int rightIdx = elements.length - 1;

        while (rightIdx >= leftIdx) {  
            int middleIdx =  (leftIdx + rightIdx) / 2; 
            // System.out.println(middleIdx); 
            // System.out.println(leftIdx + " " + rightIdx);
           
            if (elements[middleIdx] > target) {
                rightIdx = middleIdx - 1;
            } else if (elements[middleIdx] < target) {
                leftIdx = middleIdx + 1;
            } else return middleIdx;
        }
        return -1; 
    }


    public static void main(String[] args) {
        int[] elements = {1, 3, 5, 7, 9, 11, 13};
        int target = 1;
        int actualIndex = BinarySearch.binarySearch(elements, target);
        System.out.println(actualIndex);
    }
}
