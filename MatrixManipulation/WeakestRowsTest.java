import java.util.*;

public class WeakestRowsTest {
    public static void main(String[] args) {
        WeakestRowsTest wrt = new WeakestRowsTest();
        wrt.testkWeakestRows();
    }

    private void testkWeakestRows(){

        WeakestRows wr = new WeakestRows();                
        
        int[][] input  = new int[][] {
            new int[]{1,1,0,0,0},
            new int[]{1,1,1,1,0},
            new int[]{1,0,0,0,0},
            new int[]{1,1,0,0,0},
            new int[]{1,1,1,1,1}
        };

        int[] expected = new int[] {2,0,3};
        int[] actual = wr.kWeakestRows(input, 3);

        if(Arrays.equals(expected, actual)){
            System.out.println("Test Case testkWeakestRows Passed.");
        }else{
            System.out.println("Test Case testkWeakestRows FAILED. Expected: "+Arrays.toString(expected)+" Actual: "+Arrays.toString(actual)); 
        }
    }
}