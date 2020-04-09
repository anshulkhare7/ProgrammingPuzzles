
public class StepsToZeroTest {
    
    public static void main(String[] args) {
        StepsToZeroTest stt = new StepsToZeroTest();
        stt.testStepsToZero();
    }

    private void testStepsToZero(){

        StepsToZero stz = new StepsToZero();
        
        int input = 14;
        int expected = 6;        
        int actual = stz.solution(input);

        if(expected==actual){
            System.out.println("Test Case testStepsToZero Passed.");
        }else{
            System.out.println("Test Case testStepsToZero FAILED. Expected: "+expected+" Actual: "+actual); 
        }
    }

}