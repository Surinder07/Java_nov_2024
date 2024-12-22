package dec21;

public class MaxMinArray {

    public int findMaxElement(int[] arr){
        int max = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int findSmallestElement(int[] arr){
        int small = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] < small) {
                small = arr[i];
            }
        }
        return small;
    }
}

// 11 : 26 am
/*

     10 20 30 40 50 60 70 80 90 100

     -- reverse this array

     swap the elements of array



 */
