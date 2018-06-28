
public class ReverseWords_1173 {
	/**
     * @param s: a string
     * @return: reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order
     */
    public String reverseWords(String s) {
        // Write your code here
    	String[] strs = s.split(" ");

    	s = "";
    	for(int i = 0; i < strs.length; i++){
    		strs[i] = reverse(strs[i]);
    		s += (strs[i] + " ");
    	}
    		
    	return s.trim();
    }
    
    public String reverse(String str){
    	String newStr = "";
    	for(int j = str.length() - 1; j >= 0; j--){
    		newStr += str.charAt(j);
    	}
    	return newStr;
    }
    
    public static void main(String args[]){
    	ReverseWords_1173 obj = new ReverseWords_1173();
    	String s = "Let's take LeetCode contest";
    	System.out.println(obj.reverseWords(s));
    }
}
