public class LeftPad_524 {
	/**
     * @param originalStr: the string we want to append to with spaces
     * @param size: the target length of the string
     * @return: A string
     */
    static public String leftPad(String originalStr, int size) {
        // Write your code here
    	return leftPad(originalStr, size, ' ');
    }

    /*
     * @param originalStr: the string we want to append to
     * @param size: the target length of the string
     * @param padChar: the character to pad to the left side of the string
     * @return: A string
     */
    public static String leftPad(String originalStr, int size, char padChar) {
        // write your code here
    	if(originalStr.length() < size){
    		String str = "";
    		for(int i = 0; i < size - originalStr.length(); i++){
    			str += padChar;
    		}
    		return str + originalStr;
    	}else{
    		return originalStr;
    	}
    }
    
    public static void main(String args[]){
    	LeftPad_524 obj = new LeftPad_524();
    	System.out.println(obj.leftPad("foo", 5));
    	System.out.println(obj.leftPad("foobar", 6));
    	System.out.println(obj.leftPad("1", 2, '0'));
    }
}