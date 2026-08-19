
package Recursionquestions;

import java.util.Scanner;

public class Nto1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        fun(n);
    }

    private static void fun(int n) {
  if(n==0){
      return ;
        
    }
  System.out.println(n);
  fun(n-1);
   
    
    }
    
}
