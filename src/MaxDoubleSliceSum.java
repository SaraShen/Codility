
public class MaxDoubleSliceSum {
	public int solution(int[] A) {		
		int N = A.length;
		int[] LeftSideSum = new int[N];
		int[] RightSideSum = new int[N];
		LeftSideSum[0] = LeftSideSum[1] = 0;//l[1] means sum before A[i],which is empty
		RightSideSum[N-1] = RightSideSum[N-2] = 0;
		for(int i = 2; i<N-1 ; i++)
			LeftSideSum[i] = Math.max(0, LeftSideSum[i-1]+A[i-1]);
		for(int i = N-3; i>0; i--)
			RightSideSum[i] = Math.max(0, RightSideSum[i+1]+A[i+1]);
		
		int max = 0;
		for(int i =1 ;i<N-1 ; i++)
			max = Math.max(max, LeftSideSum[i]+RightSideSum[i]);
		return max;			
           
    }

}
