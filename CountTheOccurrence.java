import java.util.*;

public class CountTheOccurrence {
    public static void main(String[] args) {
        int[] arr = {2,5,7,6,5,5,5,8,8,8,8,8,7};
        int[] freq = new int[arr.length];
        int visited = -1;
        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for(int j = i+1; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    freq[j] = visited;
                }
                if(freq[i] != visited){
                    freq[i] = count;
                }
            }

        }
        for(int i = 0; i < arr.length; i++){
            if(freq[i] != visited){
                System.out.println(arr[i] + " -> " + freq[i]);
            }
        }
//                String moves = "DDRR";
//
//                int count =0;
//                int count2 = 0;
//                char[] ch =  moves.toCharArray();
//                for(int i=0;i<ch.length;i++){
//                    if(ch[i]=='U'){
//                        count++;
//                    }else if(ch[i]=='D'){
//                        count--;
//                    }else if(ch[i]=='R'){
//                        count2++;
//                    }else if(ch[i]=='L'){
//                        count2--;
//                    }
//                }
//                if(count==0 && count2==0){
//                    System.out.println("true");
//                }else{
//                    System.out.println("false");
//                }
    }
}