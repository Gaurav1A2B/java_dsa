package array;
import java.util.*;
public class Basic_questions {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the size of the array = ");
        int size=scn.nextInt();
        int[] arr=new int[size];

        // Question 1: Find all the elements that are less that 35 in an array
        // System.out.println("Enter the marks of the students = ");
        // for (int i = 0; i < size; i++) {
        //     arr[i]=scn.nextInt();
        // }
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]<35){
        //         System.out.println("Fail");
        //     }
        //     else if(arr[i]>=35 && arr[i]<50){
        //         System.out.println("Pass");
        //     }
        //     else if(arr[i]>=50 && arr[i]<60){
        //         System.out.println("Second class");
        //     }
        //     else if(arr[i]>=60 && arr[i]<70){
        //         System.out.println("First class");
        //     }
        //     else if(arr[i]>=70 && arr[i]<=100){
        //         System.out.println("Distinction");
        //     }
        //     else{
        //         System.out.println("Invalid marks");
        //     }
        // }


        // Question 2: Find the element in the array
        // System.out.println("Enter the elements of the array = ");
        // for (int i = 0; i < size; i++) {
        //     arr[i]=scn.nextInt();
        // }
        // System.out.println("Enter the element to be searched = ");
        // int element=scn.nextInt();
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==element){
        //         System.out.println("Element found at index = "+i);
        //         break;
        //     }
        //     if(i==arr.length-1){
        //         System.out.println("Element not found");
        //     }
        // }


        // Question 3: Find the maximum and minimum element in the array
        // System.out.println("Enter the elements of the array = ");
        // for (int i = 0; i < size; i++) {
        //     arr[i]=scn.nextInt();
        // }
        // int max=arr[0]; or use Integer.MIN_VALUE
        // int min=arr[0]; or use Integer.MAX_VALUE
        // for(int i=1;i<arr.length;i++){
        //     if(arr[i]>max){
        //         max=arr[i];
        //     }
        //      // Note: For max I can also use Math.max(max, arr[i]);
        //     if(arr[i]<min){
        //         min=arr[i];
        //     }
        // }
        // System.out.println("Maximum element = "+max);
        // System.out.println("Minimum element = "+min);

        // Question 4: Find the second largest element in the array
        // System.out.println("Enter the elements of the array = ");
        // for (int i = 0; i < size; i++) {
        //     arr[i]=scn.nextInt();
        // }
        // int max=arr[0];
        // int secondMax=Integer.MIN_VALUE;
        // for(int i=1;i<arr.length;i++){
        //     if(arr[i]>max){
        //         secondMax=max;
        //         max=arr[i];
        //     }
        //     else if(arr[i]>secondMax && arr[i]!=max){
        //         secondMax=arr[i];
        //     }
        // }
        // System.out.println("Second largest element = "+secondMax);

        
        scn.close();
    }
}
