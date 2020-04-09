import java.util.*;

public class RotateArrayTest {
    public static void main(String[] args) {
        RotateArrayTest rat = new RotateArrayTest();
        rat.testRotateArray();
    }

    private void testRotateArray(){

        RotateArray ra = new RotateArray();
        
        int k = 3;
        int[] input = new int[] {1,2,3,4,5,6,7};
        int[] expected = new int[] {5,6,7,1,2,3,4};
        int[] actual = ra.solution(input, k);

        if(Arrays.equals(expected,actual)){
            System.out.println("Test Case testRotateArray Passed.");
        }else{
            System.out.println("Test Case testRotateArray FAILED. Expected: "+Arrays.toString(expected)+" Actual: "+Arrays.toString(actual)); 
        }
    }
}