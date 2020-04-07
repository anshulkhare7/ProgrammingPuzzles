import java.util.*;
import java.util.stream.Collectors;

public class WeakestRows {
    public int[] kWeakestRows(int[][] mat, int k) {
        int rows = mat.length;
        int cols = mat[0].length;
                
        int[] score = new int[rows];
        for(int i=0; i < rows; i++){
            int j=0;
            for(; j < cols; j++){
                if(mat[i][j]==0){                    
                    break;
                }
            }            
            /* Using inverse modulo
		    * we can create a score to match the sort condition from description
		    * score = soldiersCount * rows + currentRowIndex
		    * so we can get soldiersCount by score / rows, and get rowIndex by score % rows
		    */
            score[i] = rows*j + i;
        }
        
        Arrays.sort(score);
        
        // List<Integer> weakestRow = ((List<Integer>)Arrays.asList(score)).stream().map(n -> n%rows).collect(Collectors.toList());
        
        int[] arr = new int[k];
        for(int i=0; i < k; i++){
            arr[i] = score[i]%rows;
        }
        return arr;
    }
}