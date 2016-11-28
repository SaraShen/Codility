
public class BinaryGap {
	public static int solution(int N) {
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
}
