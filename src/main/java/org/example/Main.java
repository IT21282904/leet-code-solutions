package org.example;
public class Main {
    public static void main(String[] args) {
        ReverseWordString rw = new ReverseWordString();
        System.out.println(rw.reverseWords("this    is   a  test     "));

        ProductOfArrayExeptSelf pas = new ProductOfArrayExeptSelf();
        int[] nums = {1,3,4,5,16};
        int[] arr = pas.productExceptSelf(nums);
        for(int i =0;i< arr.length;i++){
            System.out.print(arr[i]  +" ");
        }
    }
}