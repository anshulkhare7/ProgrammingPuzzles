
public class SmallestSubArray {

    public static void main(String[] args) {
        
    }

    public int solution(int[] input, int sum){
        if(input.length < 1)
            return -1;
        
        int minLength = Integer.MAX_VALUE;
        int startP = 0;
        int endP = 0;
        int runningSum = 0;

        while(endP < input.length){            
            runningSum = runningSum + input[endP];
            while(runningSum>=sum){
                minLength = Math.min(minLength, endP - startP + 1);
                runningSum = runningSum - input[startP++];
            }
            endP++;
        }        

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

}