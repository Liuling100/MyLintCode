public class IsPalindrome_491 {
    /**
     * @param num: a positive number
     * @return: true if it's a palindrome or false
     */
    public boolean isPalindrome(int num) {
        // write your code here
    	String str = num + "";
    	for(int i = 0, j = str.length() - 1; i < j; i++, j--){
    		if(str.charAt(i) != str.charAt(j))
    			return false;
    	}
    	
    	
    	return true;
    }
    
    public static void main(String args[]){
    	IsPalindrome_491 obj = new IsPalindrome_491();
    	Integer num = 1221;
    	System.out.println(obj.isPalindrome(num));
    }
}