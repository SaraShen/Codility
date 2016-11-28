
public class CountFactors {
	public int solution(int N) {
        int i = 1;
        int count = 0;
        while ((long)i*i<=N){
        	if(N%i == 0){
        		if(i*i == N)
        			count++;
        		else 
        			count +=2;
        	}
        	i++;
        }
        return count;
    }
}
