
public class MaxProfit {
	public int solution(int[] A){
		int result  = 0;
		int n = A.length;
		if(n<2)
			return 0;
		int[] MaxValueAfter = new int[n];
		
		MaxValueAfter[n-1] = A[n-1];
		for(int i = n-2 ;i>0 ; i--){
			MaxValueAfter[i] = Math.max(A[i], MaxValueAfter[i+1]);
		}
		int buy = A[0];
		for(int i = 0; i<n;i++){
			buy = Math.min(buy, A[i]);
			result = Math.max(result,MaxValueAfter[i]-buy);
		}
		return result;
	}

}
