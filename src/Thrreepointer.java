public class Thrreepointer {
    public static void main(String args[]){
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={2,4,6,8,10};
        int[] arr3={2,3,6,9,12};
        int x=0;
        int y=0;
        int z=0;
        while (x < arr1.length && y < arr2.length && z < arr3.length){
            if(arr1[x]==arr2[y]&&arr1[x]==arr3[z]){
                System.out.print(arr1[x]+" ");
                     x++;
                     y++;
                     z++;
            }
            else if(arr1[x]<arr2[y]){
                x++;
            }
            else if(arr2[y]<arr3[z]){
                y++;
            }
            else{
                z++;
            }
        }
    }
}
