
public class PassingCars {
	 public int solution(int[] A) {
    	 int N = A.length;
         int count =0;
         int result =0;
         int flag =0;
         if(N==1)
         	return 0;
         for(int i=0 ; i<N ; i++){
         	if(A[i] == 0){
         	    flag =1;
         		count++;
         	}
         	else{
         	    if(flag ==1)
         		    result += count;
         	    if(result>1000000000)
         		    return -1;
         	}
         } 
        return result;
    }

}
