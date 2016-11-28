
public class NumberOfDiscIntersections {
	 public int solution(int[] A) {

		 int n = A.length;
		 if(n<2)
			 return 0;
		 int[] Begin = new int[n];
		 int[] End = new int[n];
		 //init
		 for(int i = 0; i<n ; i++){
			 Begin[i] = End[i] = 0;
		 }
		 
		 for(int i = 0; i<n ; i++){
			 int left = Math.max(0, i-A[i]);
			 Begin[left]++;
			 long right = Math.min(n-1, ((long)A[i]+i));
			 End[(int) right]++;
		 }
		 
		 int cross = Begin[0]*(Begin[0]-1)/2;
		 int running = Begin[0]-End[0];
		 
		 for(int i = 1; i<n ; i++){
			 if(Begin[i]>0){
				 cross += Begin[i]*(Begin[i]-1)/2 + Begin[i]*running;
				 running +=Begin[i];
			 }
			
			running -=End[i];
		 }
		 		
		if(cross>10000000)
			 return -1;
		return cross;	     
	    }

}
