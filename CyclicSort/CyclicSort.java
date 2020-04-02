class CyclicSort{

    public static void main(String[] args) {
        
    }

    int findMissingNumber(int[] input){
        if(input.length < 1)
            return -1;
        
        for(int i=0; i < input.length ; i++){
            while(i != input[i] && input[i] < input.length){
                swap(input, i, input[i]);
            }
        }

        for(int i=0; i < input.length; i++){
            if(input[i]!=i)
                return i;
        }

        return -1;

    }

    int[] sortUniqueNumbers(int[] input){
        if(input.length < 1)
            return new int[]{};
        
        for(int i=0; i < input.length ; i++){
            while((i+1) != input[i]){
                swap(input, i, input[i]-1);
            }
        }   
        
        return input;
    }

    private void swap(int[] num, int x, int y){
        int tmp = num[x];
        num[x] = num[y];
        num[y] = tmp;
    }
}