
public class CyclicRotation {
	public static int[] solution(int[] A, int K){
    	int N = A.length;
    	if(N == 0)
    		return A;
    	if(K>=N)
    		K = K%N;
    	K = N-K;
    	int[] solution = new int[N];
    	for(int i= 0; i<N ; i++){
    		int position = i + K;
    		if(position < N)
    			solution[i] = A[position];
    		else 
    			solution[i] = A[position-N];
    	}
    	return solution;
    }
}
