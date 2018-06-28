
public class ReverseInteger_37 {
	public int reverseInteger(int number){
		
		char[] str = String.valueOf(number).toCharArray();
		
		for(int start = 0, end = str.length - 1; start < end; start++, end--){
			char temp = str[start];
			str[start] = str[end];
			str[end] = temp;
		}
		
		return Integer.parseInt(String.valueOf(str));
	}
	
	public static void main(String args[]){
		int number = 100;
		ReverseInteger_37 obj = new ReverseInteger_37();
		System.out.println(obj.reverseInteger(number));
	}
}
