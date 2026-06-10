import java.util.*;
public class Rowsum {
    public static void main(String args[]) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] a=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];

            }
            a[i]=sum;
        }
        System.out.println(Arrays.toString(a));
    }
}
