/*import java.util.*;
public class Rotate {
    public static void main(String args[]){
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] a=new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                a[j][arr.length-1-i]=arr[i][j];
            }
        }
        System.out.println(Arrays.deepToString(a));
    }
}*/
import java.util.*;

public class Rotate {
    public static void main(String args[]) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // Transpose
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[i].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr.length - 1 - j];
                arr[i][arr.length - 1 - j] = temp;
            }
        }

        System.out.println(Arrays.deepToString(arr));
    }
}
