
public class TapeEquilibrium {
	public static int solution(int[] A){
    	int N = A.length;
    	int[] dis =new int[N-1];
    	int s =0;
    	int total = 0;
    	for(int i=0; i<N ; i++)
    		total += A[i];
    	for(int i=0; i<N-1 ; i++){
    		s +=A[i];
    		dis[i]= s;
    	}
    	for(int i=0 ; i<N-1 ; i++){
    		dis[i] =Math.abs( 2*dis[i] - total);
    	}
    	int result = dis[0];
    	for(int i=0 ; i<N-1 ; i++){
    		if(dis[i] <= result)
    			result = dis[i];
    	}
    	return result;    	
    }

}
