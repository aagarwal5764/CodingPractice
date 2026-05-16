package com.dsa;

public class Demo02 {

    public static void main(String[] args) {

        int nums[] = {6, 5, 2, 8, 9, 4};

        for (int num : nums) {
            System.out.print(num + " ");
        }

        int size = nums.length;

        //  Bubble sort
        /*
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        */

        //  Selection sort
        int maxIndex = 0;
        int temp = 0;
        for(int i=0; i<size; i++){
            maxIndex = 0;
            for(int j=1; j<size-i-1; j++){
                if (nums[j] > nums[maxIndex]) {
                    maxIndex = j;
                }
            }
            temp = nums[maxIndex];
            nums[maxIndex] = nums[size-i-1];
            nums[size-i-1] = temp;
        }

        //  Insertion Sort (Like, shifting playing cards)
        for(int i=1; i<size; i++){

        }

        System.out.println();
        System.out.println("Sorting: ");

        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}
