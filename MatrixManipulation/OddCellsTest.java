
public class OddCellsTest {

    public static void main(String[] args) {
        
        OddCellsTest oct = new OddCellsTest();
        oct.testOddCelss();
              
    }

    private void testOddCelss(){
        OddCells oc = new OddCells();

        int[][] matrix = new int[2][2];
        matrix[0][0] = 0;
        matrix[0][1] = 1;
        matrix[1][0] = 1;
        matrix[1][1] = 1;
        
        int expected = 6;
        int actual = oc.oddCells(2, 3, matrix);

        if(expected==actual){
            System.out.println("Test Case testOddCelss Passed.");
        }else{
            System.out.println("Test Case testOddCelss FAILED. Expected: "+expected+" Actual: "+actual); 
        }
    }
}