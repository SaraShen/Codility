import java.util.Arrays;

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
    
    public static void main(String[] args){
    	Solution T = new Solution();
    	//T.binary_gap(15);
    	int[] A = {0,0,2,2,4};
    	int n = T.OddOccurrencesInArray(A, 5);
    	System.out.println(n);
    }
}