
public class LowercaseToUppercase_145 {
	/**
     * @param character: a character
     * @return: a character
     */
	
	public char lowercaseToUppercase(char lower){
		String temp = String.valueOf(lower).toUpperCase();
		
		return temp.charAt(0);
	}
	
	public static void main(String args[]){
		char a = 'a';
		LowercaseToUppercase_145 obj = new LowercaseToUppercase_145();
		System.out.println(obj.lowercaseToUppercase(a));
	}

}
