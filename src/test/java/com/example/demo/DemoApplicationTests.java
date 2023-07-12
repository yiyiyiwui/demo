package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        //100以内的和
        var sum =0;
        for (int i = 0; i <=100; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
    //二分半查找
    @Test
    public void test(){
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(bina(arr, 4));
    }
    private static int bina(int[]arr,int number) {
        var min=0;
        var max=arr.length-1;

        while (true) {
            if (min > max) {
                return -1;
            }
            int mid =(min+max)/2;
            if (arr[mid] > number) {
                max=mid-1;
            } else if (arr[mid] < number) {
                min = mid + 1;
            } else {
                return mid;
            }
        }
    }
    //冒泡排序
    @Test
    public void test1(){
        int[] arr = {2, 5, 3, 4, 1};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp =arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    /**
     * 选择排序
     */
    @Test
    public void test2(){
        int[] arr = {2, 3, 1, 5, 4};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp =arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
    @Test
    public void test3(){
        HashMap<Object, Object> ma = new HashMap<>();

    }

}
