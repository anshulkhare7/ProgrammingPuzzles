import java.util.*;

public class SortedSquares {

    public int[] solution(int[] input){
        int[] squaredSortedArray = new int[input.length];

        if(input.length < 1){
            return new int[] {-1};
        }

        if(input[0] >=0 ){
            return squaredArray(input);
        }

        if(input[input.length-1] < 0 ){
            return reverseArray(squaredArray(input));
        }
        
                
        int left = idxOfFrstNeg(input);
        int right = left+1;
        
        for(int i=0; i < input.length; i++){
            if(left < 0){
                squaredSortedArray[i] = input[right]*input[right];
                right++;
                continue;
            }

            if(right >= input.length){
                squaredSortedArray[i] = input[left]*input[left];
                left--;
                continue;
            }            

            if(input[left]*input[left]<input[right]*input[right]){
                squaredSortedArray[i] = input[left]*input[left];
                left--;
            }else{
                squaredSortedArray[i] = input[right]*input[right];
                right++;
            }
        }

        return squaredSortedArray;
    }

    private static int idxOfFrstNeg(int[] input){
        //Find the first negative element
        int start = 0;
        int end = input.length-1;        
        int mid = -1;
        while (start < end){
            mid = (start+end)/2;
            if(end-start==1){
                return mid;
            }            
            if(input[mid] < 0 ){
                start = mid;    
            }else{
                end = mid;                
            }
        }        

        return -1;
    }

    private static int[] squaredArray(int[] input){

        for(int i=0; i < input.length; i++){
            input[i] = input[i]*input[i];
        }
        
        return input;
        
    }

    private static int[] reverseArray(int[] input){
        int[] reversedArray = new int[input.length];
        int rvrseCntr = 0;
        for(int i = input.length-1 ; i >=0; i--){
            reversedArray[rvrseCntr++] = input[i];
        }
        return reversedArray;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {-2,0};
        //System.out.println(Arrays.toString(squaredArray(arr)));
        System.out.println(idxOfFrstNeg(arr));
        // arr = new int[] {10,9,8,7,6,5,4,3,2,1,0};
        // System.out.println(Arrays.toString(reverseArray(arr)));

        
    }
}