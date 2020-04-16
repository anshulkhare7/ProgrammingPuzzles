
public class MaxSumSubArrayTest {
    public static void main(String[] args) {
        MaxSumSubArrayTest mssat = new MaxSumSubArrayTest();
        mssat.testMaxSumSubArrayTest();
    }

    private void testMaxSumSubArrayTest(){
        MaxSumSubArray mssa =  new MaxSumSubArray();
        
        int[] input = new int[] {2, 1, 5, 1, 3, 2};
        int k = 3;

        int expected = 9 ;
        int actual = mssa.solution(input, k);

        if(expected==actual){
            System.out.println("Test Case testMaxSumSubArrayTest Passed.");
        }else{
            System.out.println("Test Case testMaxSumSubArrayTest FAILED. Expected: "+expected+" Actual: "+actual); 
        }

    }
}