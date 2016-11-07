import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
	//Lesson 1: Iterations
    public static int binary_gap(int N) {
    	String s = Integer.toBinaryString(N);
    	System.out.println(s);
    	char[] binary = s.toCharArray();  
    	int len = s.length();
    	int longest_gap = 0;
    	for(int i = 0 ,count = 0; i < len ; i++){
    		if(binary[i] == '1'){
    			if(count > longest_gap)
    				longest_gap = count;
    			count = 0 ;
    		}
    		else
    			count ++;	
    	}
    	System.out.println(longest_gap);
		return longest_gap;
    }
    //Lesson 2 :Array
    
    public static int OddOccurrencesInArray(int A[], int N){
    	Arrays.sort(A);
    	if(N == 1)
    		return A[0];
    	else
    		for(int i = 0, j= 1 ,count = 0; i < N-1 && j < N ; i+=2,j+=2,count++){
    			if(A[i] != A[j]){
    				return A[i];
    			}
    		}
		return A[N-1];
    }
    public static int[] CyclicRotation(int[] A, int K){
    	int N = A.length;
    	if(N == 0)
    		return A;
    	if(K>=N)
    		K = K%N;
    	K = N-K;
    	int[] solution = new int[N];
    	for(int i= 0; i<N ; i++){
    		int position = i + K;
    		if(position < N)
    			solution[i] = A[position];
    		else 
    			solution[i] = A[position-N];
    	}
    	return solution;
    }
    // Lesson 3: Time Complexity
    public static int TapeEquilibrium(int[] A){
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
    public int FrogJmp(int X, int Y, int D) {
    	int n = (Y-X)/D;
    	if((Y-X)%D ==0)
    		return n;
    	else return n+1;
       
    }
    public int PermMissingElem(int[] A){
    	int N = A.length;
    	if(N==0)
    		return 1;
    	Arrays.sort(A);
    	for(int i = 1; i<N+1 ;i++){
    		if (A[i-1] != i){
    			return i+1;
    		}
    	}
    	
		return N+1;
    }
    //lesson 4
    public static int PermCheck(int[] A){
		int N = A.length;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0;i<N;i++){
			if(map.containsKey(A[i]) || A[i] >= N || A[i]<=0)
				return 0;
			map.put(A[i], i);
		}
		return 1;
	}
    public int FrogRiverOne(int X, int[] A) {
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
    public int MissingInteger(int[] A) {
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
    public int[] MaxCounters(int N, int[] A) {
    	//time complexity:O(N*M)
    	int[] result = new int[N];
        int max = 0;
        for(int i= 0;i<N ;i++)
     	   result[i] = 0;
        int M = A.length;
        for(int i = 0; i<M; i++){
     	   if(A[i]!= N+1){
     		   result[A[i]-1]++;
     		   if ( result[A[i]-1] > max)
     			   max = result[A[i]-1];
     	   }
     	   else{
     		   for(int j= 0;j<N ;j++)
     	    	  result[j]= max;
     	   }  
        }
        return result;
    }
    public int[] MaxCounters2(int N , int[] A){
    	//time complexity:O(N+M)
    	int[] counters = new int[N];
    	int M = A.length;
    	int max = 0;
    	int temp_max = 0;
    	for(int i=0;i<M;i++){
    		int index = A[i]-1;
    		if(A[i] == N+1){//do max
    			temp_max = max;
    		}else{
    			if(counters[index] <temp_max)
    				counters[index] = temp_max;
    			counters[index]++;
    			if(counters[index] > max)
    				max = counters[index];
    		}
    	}
    	for(int i=0; i< N;i++)
    		if(counters[i]<temp_max)
    			counters[i]=temp_max;
    	return counters;
    }
    //Lesson 5
    public int PassingCars(int[] A) {
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
    
    
    
    public static void main(String[] args){
    	Solution T = new Solution();
    }
}