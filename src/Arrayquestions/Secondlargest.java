
package Arrayquestions;
public class Secondlargest {
    public static void main(String args[]){
        
        int arr[]={10,20,30,40,50};
        int max=Integer.MIN_VALUE;
        int small=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>small&&arr[i]!=max){
                small=arr[i];
                
            }
        }
        System.out.println("Second largest elment : "+small);
    }
    
}
