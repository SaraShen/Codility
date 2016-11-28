import java.util.HashMap;

public class PermCheck {
	public static int solution(int[] A){
		int N = A.length;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0;i<N;i++){
			if(map.containsKey(A[i]) || A[i] >= N || A[i]<=0)
				return 0;
			map.put(A[i], i);
		}
		return 1;
	}

}
