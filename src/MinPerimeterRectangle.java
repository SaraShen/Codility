
public class MinPerimeterRectangle {
	 public int solution(int N) {
		 int a = (int) Math.sqrt(N);
		 while(N%a!=0)
			 a--;
		 return (int) (a+N/a)*2;
	 }
	     
	 
}
