package TCS_NQT;

public class MovingZeros {
    public static void main(String args[]){
        int arr[]={4,5,0,1,9,0,5,0};
        int size=8;
        //int[] arr1=new int[size];
        int index=0;
        for(int i=0;i<size;i++){
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }
        }
        while(index<size){
            arr[index++]=0;
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
