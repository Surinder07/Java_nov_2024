package dec21;

public class MaxArray {
    public static void main(String[] args) {

        int[] arr = {10,20,40,50,23};
        MaxMinArray maxArrayDemo = new MaxMinArray();
        int maxElement = maxArrayDemo.findMaxElement(arr);

        System.out.print("Max element is  : " + maxElement);
        System.out.println();

        int smallestElement = maxArrayDemo.findSmallestElement(arr);
        System.out.print("Smallest Element in array : "+smallestElement);



     /*   Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        System.out.println("Enter the element of the array ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();

        }*/



    }



}
