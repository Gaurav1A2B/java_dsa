package array;
// public class Basic {
//     public static void main(String[] args) {
//         int[] arr=new int[5]; // Memory allocation for 5 integers in the array, default value of all the elements will be 0
//         System.out.println(arr[3]); // Accessing the first element of the array, it will print 0 as it is the default value
//         // arr[0]=10;
//         // arr[1]=20;
//         // arr[2]=30;
//         // arr[3]=40;
//         // arr[4]=50;


//         //Can also use this way to initialize the array
//         // Scanner scn=new Scanner(System.in);
//         // for (int i = 0; i < 5; i++) {
//         //     arr[i]=scn.nextInt();
//         // }

//         // //int arr[]={10,20,30,40,50}; //This is also a way to initialize the array
//         // for(int i=0;i<arr.length;i++){
//         //     System.out.println(arr[i]);
//         // }
//         // for(int i:arr){
//         //     System.out.println(i);
//         // }
//         // scn.close();
//     }
// }

import java.util.*;
class Basic{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=scn.nextInt();
        }
        int target=scn.nextInt();
        for(int i=0;i<num;i++){
            if(target==arr[i]){
                System.out.print(i);
                break;
            }else if(i==num-1){
                System.out.println(-1);
                break;
            }
        }
        scn.close();
    }
}