package recursion;
import static java.lang.System.in;
import java.util.*;
// public class Basic_recursion {
//     public static void mango(){


//         System.out.println("    I am in mango!   ");
//     }
//     public static void banana(){
//         mango();
//         System.out.println("    I am in banana   ");
//     }
//     public static void apple(){
//         banana();
//         System.out.println("    I am in apple!   ");
//         mango();
//     }
//     public static void main(String[] args) {
//         System.out.println("    I am main file !    ");
//         apple();
//     }
// }

//Factorial question
// public class Basic_recursion{
//     public static int fact(int i){
//         if(i==1){
//             return 1;
//         }
//         return i*fact(i-1);
//     }
//     public static void main(String[] args) {
//         Scanner scn=new Scanner(System.in);
//         System.out.println("Enter the number for which the factorial is to be calculated = ");
//         int num=scn.nextInt();
//         int fact=fact(num);
//         System.out.println(fact);
//         scn.close();
//     }
// }

// 1 to N printing
// class Basic_recursion
// {
//     public static void output(int i){
//         if(i==1){
//             System.out.println(i);
//             return;
//         }
//         output(i-1);
//         System.out.println(i);
//     }
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		Scanner scn=new Scanner(System.in);
//         int num=scn.nextInt();
//         output(num); 
//         scn.close();
// 	}
// }

//Sum of N numbers
// 

//Power of n
// class Basic_recursion
// {
//     public static int power(int a,int b){
//         if(b==1) return 2;
//         return 2*power(a,b-1);
//     }
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		Scanner scn=new Scanner(System.in);
//         int a=scn.nextInt();
//         int b=scn.nextInt();
//         System.out.println(power(a,b));
// 	}
// }

// Write a function to calculate the nth fibonachi number using recursion
class Basic_recursion{
    public static int fibo(int a){
        if (a<=1) {
            return a;
        }
        //Can also use  if(n==0 || n== 1){
        //   return n;
        //}
        return fibo(a-1)+fibo(a-2);
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(in);
        System.out.println("Enter the term you want = ");
        int num = scn.nextInt();
        System.out.println(fibo(num));
        scn.close();
    }
} 
