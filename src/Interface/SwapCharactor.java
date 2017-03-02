package Interface;

public class SwapCharactor {

	
	String swap(String input) {
		
		int len = input.length();
		String out = "";
		for (int i = len-1; i >= 0 ; i--) {
			out += input.charAt(i);
		}
		
		return out;
		
	}
}
