public class Twopointer {
    public static void main(String args[]){
        int[] arr={1,2,8,7,6,12,15,18};
        int target=20;
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.println("true");
                return;
            }
            else if(sum>target){
                right--;
            }
            else{
                left++;
            }
        }
        System.out.println("false");
    }
}
