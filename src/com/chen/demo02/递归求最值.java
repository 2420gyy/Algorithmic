package com.chen.demo02;/**
*@Author: chenchen
*@CreateTime: 2022-07-17  23:13
*@Description: TODO
*/
public class 递归求最值 {
    public static void main(String[] args) {
        int arr[] = {13,2,4,5,6,7,8,9,10,12};
        int max = getMax(arr, 0, arr.length-1);
        System.out.println(max);
    }
    public static int getMax(int []arr,int left,int right){
        // 取中点，分别递归左右两边，求最大的值
        if(left == right){
            return arr[left];
        }
        int mid = left + (right - left)/2;
        int leftMax = getMax(arr,left,mid);
        int rightMax = getMax(arr,mid+1,right);
        return Math.max(leftMax,rightMax);
    }

}
