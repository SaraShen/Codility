
public class MaxCounters {
	public int[] solution(int N , int[] A){
    	//time complexity:O(N+M)
    	int[] counters = new int[N];
    	int M = A.length;
    	int max = 0;
    	int temp_max = 0;
    	for(int i=0;i<M;i++){
    		int index = A[i]-1;
    		if(A[i] == N+1){//do max
    			temp_max = max;
    		}else{
    			if(counters[index] <temp_max)
    				counters[index] = temp_max;
    			counters[index]++;
    			if(counters[index] > max)
    				max = counters[index];
    		}
    	}
    	for(int i=0; i< N;i++)
    		if(counters[i]<temp_max)
    			counters[i]=temp_max;
    	return counters;
    }

}
