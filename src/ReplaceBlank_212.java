
public class ReplaceBlank_212 {
	/*
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    public int replaceBlank(char[] string, int length) {
        // write your code here
    	if(string == null || string.length == 0 || length == 1)
    		return 0;
    	
    	String newStr = "";
    	for(int i = 0; i < length; i++){
    		if(string[i] == ' '){
    			newStr += "%20";
    		}else{
    			newStr += string[i];
    		}
    	}
    	
    	
    	
    	System.out.println(newStr);
    	
    	return newStr.length();
    }
    
    public static void main(String args[]){
    	ReplaceBlank_212 obj = new ReplaceBlank_212();
    	
    	String str = "Mr John Smith";
    	char[] string = str.toCharArray();
    	int length = string.length;
    	
    	obj.replaceBlank(string, length);
    }
}
