
public class MaxSumSubArray {

    public static void main(String[] args) {
        
    }

    public int solution(int[] input, int k){
        if(input.length < k)
            return -1;
        
        int startP = 0;
        int endP = startP + k;
        int sum = 0;

        for(int i=startP; i< endP; i++){
            sum = sum + input[i];
        }

        int maxSum = sum;
        while(endP < input.length){
            sum = sum + input[endP] - input[startP];
            maxSum = Math.max(sum, maxSum);
            endP++;
            startP++;
        }

        return maxSum;
    }
}