
public class SmallestSubArrayTest {

    public static void main(String[] args) {
        SmallestSubArrayTest ssat = new SmallestSubArrayTest();
        ssat.testSmallestSubArray();
    }

    private void testSmallestSubArray(){
        SmallestSubArray ssa =  new SmallestSubArray();
        
        int[] input = new int[] {2, 1, 5, 2, 3, 2};
        int sum = 7;

        int expected = 2 ;
        int actual = ssa.solution(input, sum);

        if(expected==actual){
            System.out.println("Test Case testSmallestSubArray Passed.");
        }else{
            System.out.println("Test Case testSmallestSubArray FAILED. Expected: "+expected+" Actual: "+actual); 
        }
    }
}