class CyclicSort{

    public static void main(String[] args) {
        
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