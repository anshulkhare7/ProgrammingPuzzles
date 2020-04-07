import java.util.Arrays;

public class DIStringTest {
    public static void main(String[] args) {
        DIStringTest dst = new DIStringTest();
        dst.testMatch();
    }

    public void testMatch(){
        DIString ds = new DIString();
        String input = "IDID";

        int[] expected = new int[] {0, 4, 1 , 3, 2};
        int[] actual = ds.match(input);
        
        if(Arrays.equals(expected, actual)){
            System.out.println("Test Case testMatch Passed.");
        }else{
            System.out.println("Test Case testMatch FAILED. Expected: "+Arrays.toString(expected)+" Actual: "+Arrays.toString(actual)); 
        }
    }
}