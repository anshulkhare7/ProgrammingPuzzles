import java.util.*;

public class RotateArray {

    public static void main(String[] args) {
        int[] array = new int[] {1,2,3, 4,5,6,7,8};
        System.out.println(Arrays.toString(reverseArray(array, 4, 7)));
    }

    public int[] solution(int[] input, int k){
        k = k%input.length;
        input = reverseArray(input, 0, input.length-1);
        input = reverseArray(input, 0, k-1);
        input = reverseArray(input, k, input.length-1);
        return input;
    }

    private static int[] reverseArray(int[] input, int start, int end){
        
        while(start < end){
            int tmp = input[start];
            input[start] = input[end];
            input[end] = tmp;
            start++;
            end--;
        }

        return input;
    }
}