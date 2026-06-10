public class Commonele {
    public static void main(String args[]){
        int[] arr={1,2,3,4,5,6};
        int[] arr1={2,4,6,8,10};
        int[] arr2={2,3,6,9,12};
        for(int k=0;k<arr.length;k++) {
            boolean a1 = false;
            boolean a2 = false;
            for (int i = 0; i < arr1.length; i++) {
                if (arr[k] == arr1[i]) {
                    a1 = true;
                }
            }
            for (int j = 0; j < arr2.length; j++) {
                if (arr[k] == arr2[j]) {
                    a2 = true;
                }
            }
            if (a1 && a2) {
                System.out.print(arr[k] + " ");

            }
        }
    }
}
