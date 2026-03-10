package stack_dsa;
import java.util.*;
public class Copy_stack {
    public static void main(String[] args) {
        System.out.print("Enter the nuber of elements =");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2= new Stack<>();
        System.out.print("Enter the elements =");
        for(int i=0;i<num;i++){
            st1.push(scn.nextInt());
        }
        for(int i=0;i<num;i++){
            int a=st1.pop();
            st2.push(a);
        }
        System.out.print(st2);
        scn.close();
    }
}
