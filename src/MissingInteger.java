import java.util.HashMap;

public class MissingInteger {
	public int solution(int[] A) {
    	int N = A.length;
    	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    	for(int i = 0; i<N ; i++ )// value does not matter, use map for unique key
    		if(!map.containsKey(A[i]))
    			map.put(A[i], i);
    	int max = 1;
    	for(int i = 0; i< map.size() ;i++){
    		if(map.containsKey(max))
    			max++;
    		else 
    			return max;
    	}
		return max;  
    }
}
