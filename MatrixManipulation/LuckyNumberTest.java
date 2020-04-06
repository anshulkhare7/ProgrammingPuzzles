import java.util.Arrays;

public class LuckyNumberTest {

    public static void main(String[] args) {
        
        LuckyNumberTest lnt = new LuckyNumberTest();
        lnt.testLuckyNumber();
              
    }

    private void testLuckyNumber(){ 
        int[][] matrix = new int[][] {new int[]{3,7,8},new int[] {9,11,13}, new int[] {15,16,17}};

        LuckyNumber ln = new LuckyNumber();
        int[] expected = new int[] {15};
        int[] actual = ln.luckyNumbers(matrix);

        if(Arrays.asList(expected).equals(Arrays.asList(actual))){
            System.out.println("Test Case testOddCelss Passed.");
        }else{
            System.out.println("Test Case testOddCelss FAILED. Expected: "+Arrays.toString(expected)+" Actual: "+Arrays.toString(actual)); 
        }
    }
}