
public class GenomicRangeQuery {
	public int[] solution(String S, int[] P, int[] Q) {
		int n = S.length();
		int[] A = new int[n];
		int[] C = new int[n];
		int[] G = new int[n];
		int c1 = 0,c2 = 0,c3 = 0;
		char[] sc = S.toCharArray();
		for(int i =0; i<n; i++){
			if(sc[i] == 'A')
				c1++;
			else if(sc[i] == 'C')
				c2++;
			else if (sc[i] == 'G')
				c3++;			
			A[i] = c1;
			C[i] = c2;
			G[i] = c3;
		}
		
		int m = P.length;
        int[] result = new int[m];
        for(int i = 0;  i<m ; i++){
        	if(P[i]==0){
        		if(A[Q[i]] >0)
        			result[i] = 1;
        		else if(C[Q[i]] >0)
        			result[i] = 2;
        		else if(G[Q[i]] >0)
        			result[i] = 3;
        		else result[i] = 4;
        	}else{
        		if(A[Q[i]]>A[P[i]-1])
        			result[i] = 1;
        		else if(C[Q[i]]>C[P[i]-1])
        			result[i] = 2;
        		else if(G[Q[i]]>G[P[i]-1])
        			result[i] = 3;
        		else
        			result[i] = 4;
        	}
        	
        }
        return result;
    }
}
