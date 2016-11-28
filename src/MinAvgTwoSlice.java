
public class MinAvgTwoSlice {
	public int solution(int[] A) {
        int index = 0;
        int n = A.length;
        double min =(double)(A[0]+A[1])/2;
        double avg = 0;
        for(int i = 0; i<n-1 ; i++){
        	avg = (double)(A[i]+A[i+1])/2;
        	if(avg<min){
        		index = i;
        		min = avg;
        	}
        }
        for(int i = 0; i<n-2; i++){
        	avg = (double)(A[i]+A[i+1]+A[i+2])/3;
        	if(avg<min){
        		index = i;
        		min = avg;
        	}
        }       
        return index;
    }
}
