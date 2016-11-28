import java.util.Vector;

public class Flags {
	public int solution(int[] A) {
		int n = A.length;
	//	HashMap<Integer,Integer> peeks = new HashMap<Integer,Integer>();
		Vector<Integer> peek = new Vector<Integer>();
		Vector<Integer> dis = new Vector<Integer>();
		for(int i = 1;i<n-1;i++){
			if(A[i]>A[i-1] && A[i]>A[i+1]){
				peek.add(i);
			}
		}
		int peeks = peek.size();
		for(int i =0; i<peeks-1 ;i++)
			dis.add(peek.get(i+1)-peek.get(i));
		return peeks;
		
			
	}
}
