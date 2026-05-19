
    package Arrayquestions;
    public class shiftarrayleft {
        public static void main(String[] args) {
            int arr[]={10,20,30,40};
           int  n=arr.length-1;
            int temp=arr[0];
            for(int i=0;i<n;i++){
                arr[i]=arr[i+1];

            }
            arr[n-1]=temp;
            for(int i=0;i<n;i++){
                System.out.print(arr[i]);
            }
        }

    }
