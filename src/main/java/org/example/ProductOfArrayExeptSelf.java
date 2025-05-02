package org.example;

public class ProductOfArrayExeptSelf {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int tray;
            int[] arr = new int[nums.length];
            for(int i = 0;i< nums.length; i++){
                tray = nums[0];
                nums[0] =nums[i];
                nums[i]=tray;
                arr[i]=1;
                for(int j = 1;j< nums.length; j++){
                    arr[i]=arr[i]*nums[j];
                }

            }
            return arr;
        }
    }
}

