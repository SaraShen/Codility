import java.util.HashMap;

public class FrogRiverOne {
	public int solution(int X, int[] A) {
    	int N = A.length;
    	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    	for(int i = 1; i<=X ; i++ )// i is position
    		map.put(i, N+1);//position, min(time)
    	for(int i = 0; i<N ; i++){//i is time,A[i] is position
    		if(map.containsKey(A[i])){
    			if(i<map.get(A[i]))
    				map.put(A[i], i);
    		}
    	}
    	int time = 0;
    	if(map.containsValue(N+1))
    		return -1;
    	else
    		for(int i =1; i <= X ;i++)
    			if(map.get(i)>time)
    				time = map.get(i);			
		return time;       
    }
}
