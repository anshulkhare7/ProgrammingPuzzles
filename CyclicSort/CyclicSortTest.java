import java.util.*;

class CyclicSortTest{

    public static void main(String[] args) {
        CyclicSortTest cst = new CyclicSortTest();
        cst.testSortUniqueNumbers();
    }

    void testSortUniqueNumbers(){

        int[] input = new int[]{9,3,8,7,6,1,5,2,4};
        int[] expected = new int[]{1,2,3,4,5,6,7,8,9};

        CyclicSort cs = new CyclicSort();
        int[] actual = cs.sortUniqueNumbers(input);

        if(Arrays.equals(expected, actual)){
            System.out.println("Test Case testSortUniqueNumbers Passed.");        
        }else{
            System.out.println("Test Case testSortUniqueNumbers FAILED. Expected: "+Arrays.toString(expected)+" Actual: "+Arrays.toString(actual)); 
        }
    }
}