import java.util.*;

public class LuckyNumberTest {

    public static void main(String[] args) {
        
        LuckyNumberTest lnt = new LuckyNumberTest();
        lnt.testLuckyNumber();
              
    }

    private void testLuckyNumber(){ 
        int[][] matrix1 = new int[][] {new int[]{3,7,8},new int[] {9,11,13}, new int[] {15,16,17}};
        int[][] matrix2 = new int[][] {new int[]{1,10,4,2},new int[] {9,3,8,7}, new int[] {15, 16, 17, 12}};

        LuckyNumber ln = new LuckyNumber();
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(15);
        // expected.add(12);
        
        List<Integer> actual = ln.luckyNumbers(matrix1);
        // List<Integer> actual = ln.luckyNumbers(matrix2);

        if(expected.equals(actual)){
            System.out.println("Test Case testLuckyNumber Passed.");
        }else{
            System.out.println("Test Case testLuckyNumber FAILED. Expected: "+expected+" Actual: "+actual); 
        }
    }


}