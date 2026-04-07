import java.util.*;
public class CopyElement {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] arr2 = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            arr2[i] = arr[i];
        }
        for(int j = 0; j < arr.length; j++){
            System.out.print(arr2[j] + " ");
        }
    }
}
