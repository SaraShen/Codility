
public class MaxSlice {
	public int solution(int[] A) {
        int N = A.length;
        int[] sum = new int[N];
        sum[0] = A[0];       
        for(int i = 1;i<N;i++)
        	sum[i] = Math.max(A[i], sum[i-1]+A[i]);
       
        int max = sum[0];
        for(int i = 1;i<N;i++)
        	if(max < sum[i])
        		max = sum[i];
        return max;
    }
}
