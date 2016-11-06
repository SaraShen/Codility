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
    // Lesson 4: Time Complexity
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
    
    public static void main(String[] args){
    	Solution T = new Solution();
    }
}