
public class FrogJmp {
	public int solution(int X, int Y, int D) {
    	int n = (Y-X)/D;
    	if((Y-X)%D ==0)
    		return n;
    	else return n+1;
       
    }

}
