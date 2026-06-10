import java.util.Arrays;

public class ColSum {
    public static void main(String args[]) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] a=new int[arr.length];
       /* for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++) {
                if (i == 0 || i == arr.length - 1) {
                    System.out.print(arr[i][j]+" ");

                }


            }
                System.out.println();

    }*/
        for(int j=0;j<arr[0].length;j++){
            int sum=0;
            for(int i=0;i<arr.length;i++){
           sum+=arr[i][j];
            }
            System.out.print(sum);
        }
}

}
