public class CountNegativeSortedMatrix {

    public int countNegative(int[][] input){

        int negCount = 0;

        for(int i=0; i < input.length; i++){            
            int negIndex = findFirstNegativeIndex(input[i]);
            if(negIndex>=0){
                negCount = negCount+ input[i].length - negIndex;
            }            
        }

        return negCount;
        
    }

    private static int findFirstNegativeIndex(int[] arr){

        int start = 0;
        int end = arr.length -1;        
        int mid = -1;

        while(start+1 < end){
            mid = (start+end)/2;
            if(arr[mid] < 0){
                end = mid;
            }else{
                start=mid;
            }            
        }

        return arr[start] < 0 ? start : (arr[end] < 0 ? end : -1);
    }
}