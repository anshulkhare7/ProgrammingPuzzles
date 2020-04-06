import java.util.*;

public class LuckyNumber {

    public List<Integer> luckyNumbers(int[][] indices) {
        
        List<Integer> luckNumbers = new ArrayList<>();

        int rows = indices.length;
        int cols = indices[0].length;
        
        int[] rowList = new int[rows];
        int[] colList = new int[cols];

        Arrays.fill(rowList, Integer.MAX_VALUE);
        Arrays.fill(colList, Integer.MIN_VALUE);

        

        for(int i=0; i < rows; i ++){
            for(int j=0; j < cols; j++){
                rowList[i] = Math.min(indices[i][j], rowList[i]);
                colList[j] = Math.max(indices[i][j], colList[j]);
            }
        }
        
        for(int i=0; i < rowList.length; i++)   {
            for(int j=0; j < colList.length; j++){
                if(rowList[i]==colList[j]){
                    luckNumbers.add(rowList[i]);
                }
            }
        }


        return luckNumbers;
    }    

    public static void main(String[] args) {
    }
}