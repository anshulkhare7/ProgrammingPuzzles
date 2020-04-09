import java.util.*;

public class SortedSquaresTest {
    public static void main(String[] args) {
        SortedSquaresTest sst = new SortedSquaresTest();
        sst.testSortedSquares();
    }

    private void testSortedSquares(){

        SortedSquares ss = new SortedSquares();
        
        int[] input = new int[] {-2,0};
        int[] expected = new int[] {0,4};
        // int[] input = new int[] {-4,-1,0,3,10};
        // int[] expected = new int[] {0,1,9,16,100};
        int[] actual = ss.solution(input);

        if(Arrays.equals(expected, actual)){
            System.out.println("Test Case testSortedSquares Passed.");
        }else{
            System.out.println("Test Case testSortedSquares FAILED. Expected: "+Arrays.toString(expected)+" Actual: "+Arrays.toString(actual)); 
        }
    }
}