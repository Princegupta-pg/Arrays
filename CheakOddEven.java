import java.util.*;
public class CheakOddEven {
    public static void main(String[] args) {
        int[] arr = {5,2,6,4,9,3,5,8,55};
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            }else{
                odd++;
            }
        }
        System.out.println( " Total No of even = " +even);
        System.out.println(" Total no of odd = "+odd);
    }
}
