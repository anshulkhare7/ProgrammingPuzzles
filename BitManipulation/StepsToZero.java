class StepsToZero{
    public int solution(int input){
        if(input==0)
            return -1;
        
        int steps = 0;        
        while(input>0){
            if((input & 1) == 1){
                steps = steps+2;
            }else{
                steps++;
            }
            input = input >> 1;
            System.out.println("Stepd: "+steps+" Input: "+input);
        }

        return steps - 1;
    }
}
