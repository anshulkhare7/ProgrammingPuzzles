
public class DIString {
    public int[] match(String S){
        int N = S.length();
        int max = N;
        int min = 0;
        int[] A = new int[N+1];

        for(int i=0; i < N; i++){
            if(S.charAt(i)=='I'){
                A[i] = min;
                min++;                
            }else{
                A[i] = max;
                max--;
            }
        }

        if(S.charAt(N-1)=='I'){
            A[N]=min;
        }else{
            A[N]=max;
        }

        return A;
    }
}