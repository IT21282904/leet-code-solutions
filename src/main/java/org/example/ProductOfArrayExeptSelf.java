package org.example;

public class ProductOfArrayExeptSelf {

        public int[] productExceptSelf(int[] nums) {
            int[] arr = new int[nums.length];
            int front;
            int rear;


                front = 1;
                rear = 1;
                for(int j = 0;j<nums.length;j++){
                    arr[j] = front;
                    front*= nums[j];
                }
                for(int j =nums.length-1;j>=0;j--){

                    arr[j] *=rear;
                    rear*= nums[j];
                }
            return arr;
        }
    }


