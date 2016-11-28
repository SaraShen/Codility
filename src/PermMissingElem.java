import java.util.Arrays;

public class PermMissingElem {
	public int solution(int[] A){
    	int N = A.length;
    	if(N==0)
    		return 1;
    	Arrays.sort(A);
    	for(int i = 1; i<N+1 ;i++){
    		if (A[i-1] != i){
    			return i+1;
    		}
    	}
    	
		return N+1;
    }

}
