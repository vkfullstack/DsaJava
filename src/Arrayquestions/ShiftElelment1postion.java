
package Arrayquestions;
public class ShiftElelment1postion {
    public static void main(String[] args) {
        int arr[]={10,20,30,80};
        int temp=arr.length;
        
        
        for( int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];  
        }
            arr[0]=temp;
            
       for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
          
    
}
    }
}
                
    


