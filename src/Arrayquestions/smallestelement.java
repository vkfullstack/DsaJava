
package Arrayquestions;
import java.util.Scanner;
public class smallestelement {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the no of element");
       int num=sc.nextInt();
       int [] arr= new int[num];
       int small=Integer.MAX_VALUE;
       System.out.println("enter the value");
      for(int i=0;i<arr.length;i++){
          
         arr[i]=sc.nextInt();
      }
      for(int i=0;i<arr.length;i++){
          if(arr[i]<small){
              small = arr[i];
          }
           
      }
       System.out.println("smallest element is:"+small);
    }
    
}
