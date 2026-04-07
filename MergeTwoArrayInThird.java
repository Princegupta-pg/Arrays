public class MergeTwoArrayInThird {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int[] arr2 = {8,9,6,5,7,2};
        int[] arr3 = new int[arr.length + arr2.length];
        int k = 0;
        for(int i = 0; i < arr.length; i++){
            arr3[k++] = arr[i];

        }
        for(int j = 0; j < arr2.length; j++){
            arr3[k++] = arr2[j];
        }

        for(int j = 0; j < arr3.length; j++){
            System.out.print(arr3[j] + " ");
        }

    }
}
