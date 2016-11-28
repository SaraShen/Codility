import java.util.Stack;
public class StoneWall {
	public int solution(int[] H) {
        int count = 0;
        int N = H.length;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0 ; i<N ; i++){
        	if(stack.isEmpty())
        		stack.push(H[i]);
        	else{
        		int peek = stack.peek();
        		if(peek == H[i])
        			continue;
        		else if(peek<H[i]){
        			stack.push(H[i]);
        		}
        		else{
        			while(!stack.isEmpty() && stack.peek()>H[i]){
        				stack.pop();
        				count++;
        			}
        			if(stack.isEmpty() || stack.peek()<H[i])
        				stack.push(H[i]);
        		}
        	}
        }
        return count + stack.size();
    }
}
