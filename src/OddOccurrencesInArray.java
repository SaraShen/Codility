import java.util.Arrays;

public class OddOccurrencesInArray {
	public static int solution(int A[], int N){
    	Arrays.sort(A);
    	if(N == 1)
    		return A[0];
    	else
    		for(int i = 0, j= 1 ,count = 0; i < N-1 && j < N ; i+=2,j+=2,count++){
    			if(A[i] != A[j]){
    				return A[i];
    			}
    		}
		return A[N-1];
    }
}
