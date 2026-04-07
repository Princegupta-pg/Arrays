import java.util.*;
public class ContainsGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,8,6,9,7,3,44,56,66,55};
        System.out.print("Cheak an elements in the array: ");
        int k = sc.nextInt();
        boolean istrue = false;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == k){
                istrue = true;
            }
            }
        if(istrue){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
