
package Arrayquestions;
public class Largestelemnt {
    public static void main(String args[]){
    int arr[]={10,20,30,40,90,99};
    int big=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>big){
            
            big=arr[i];
        }
    
}
    System.out.println("the largest lement is: "+big);
   
    }
    
}
