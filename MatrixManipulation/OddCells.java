import java.util.*;

class OddCells {

    public int oddCells(int n, int m, int[][] indices) {
        
        int[][] mymatrix = new int[n][m];
        
        int[] rowMap = new int[n];
        int[] colMap = new int[m];        
        

        for(int i=0; i < indices.length; i++){
            int row = indices[i][0];
            int col = indices[i][1];
            rowMap[row] = rowMap[row]+1;
            colMap[col] = colMap[col]+1;            
        }
        
        int numOdds = 0;        
        for(int i=0; i < mymatrix.length; i ++){                        
            for(int j=0; j < mymatrix[i].length; j++){                
                mymatrix[i][j] = colMap[j]+rowMap[i];
                if(mymatrix[i][j]%2!=0)
                    numOdds++;
            }            
        }        
        
        return numOdds;
    }   
    
}