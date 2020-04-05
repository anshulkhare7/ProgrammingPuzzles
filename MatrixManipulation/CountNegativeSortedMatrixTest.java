
public class CountNegativeSortedMatrixTest {
    public static void main(String[] args) {
        CountNegativeSortedMatrixTest test = new CountNegativeSortedMatrixTest();
        test.testCountNegativesInSortedMatrix();
    }

    private void testCountNegativesInSortedMatrix(){

        CountNegativeSortedMatrix cnsm = new CountNegativeSortedMatrix();        

        int[][] matrix = new int[4][4];

        int expected = 8;
        matrix[0] = new int[] {4, 3, 2, -1};
        matrix[1] = new int[] {3, 2, 1, -1};
        matrix[2] = new int[] {1, 1, -1, -2};
        matrix[3] = new int[] {-1, -1, -2, -3};
        
        int actual = cnsm.countNegative(matrix);

        if(expected==actual){
            System.out.println("Test Case testCountNegativesInSortedMatrix Passed.");
        }else{
            System.out.println("Test Case testCountNegativesInSortedMatrix FAILED. Expected: "+expected+" Actual: "+actual); 
        }
    }
}