import java.util.Arrays;

public class Main {


        public static int[] add( int[] arr, int num){

            return insert(arr, arr.length + 1, num);
        }

        public static int[] delete( int[] arr){
            int[] arr2 = new int[arr.length - 1];
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = arr[i];
            }
            return arr2;
        }

        public static int[] insert ( int[] arr, int index, int num){
            int[] brr = new int[arr.length + 1];
            for (int i = 0; i < index - 1; i++) {
                brr[i] = arr[i];
            }
            brr[index - 1] = num;
            for (int i = index; i < brr.length; i++) {
                brr[i] = arr[i - 1];
            }
            return brr;
        }

    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i=0;i < arr.length; i++){
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
        arr = insert(arr,5,4);
        System.out.println(Arrays.toString(arr));

    }
}