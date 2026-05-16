package com.dsa;

public class Demo01 {

    public static void main(String[] args) {

        int nums[] = {5, 7, 9, 11, 13};
        int target = 11;

        int index = linearSearch(nums, target);
        System.out.println("Target found at: " + index);

        int index2 = binarySearch(nums, target);
        System.out.println("Target found at: " + index2);

    }

    public static int linearSearch(int[] nums, int target){
        int steps = 0;
        for(int i=0; i<nums.length; i++){
            steps++;
            if(nums[i] == target){
                System.out.println("Steps taken by Linear Search: " + steps);
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int target){
        int steps = 0;
        int left = 0;
        int right = nums.length - 1;

        while(left<=right){
            steps++;
            int mid = (left+right)/2;

            if(nums[mid] == target) {
                System.out.println("Steps taken by Binary Search: " + steps);
                return mid;
            }
            else if(nums[mid]<target)
                left = mid+1;
            else
                right = mid-1;
        }
        return -1;
    }
}
