public class Slidingwindow {
    public static void main(String args[]){
        int arr[]={2,9,31,-4,21,7};
        int k=3;
        int max=0;
        int window=0;
        for(int i=0;i<k;i++){
            window+=arr[i];
        }
        max=window;
        for(int i=k;i<arr.length;i++){
            window=window-arr[i-k]+arr[i];
            max=Math.max(max,window);
        }
        System.out.println(max);
    }
}
