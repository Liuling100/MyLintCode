public class InputStream_823 {
    /**
     * @param inputA: Input stream A
     * @param inputB: Input stream B
     * @return: The answer
     */
    public String inputStream(String inputA, String inputB) {
        // Write your code here
    	inputA = inputA.toLowerCase();
    	inputB = inputB.toLowerCase();
    	
    	String outputA = "";
    	for(int i = 0; i < inputA.length(); i++){
    		if(inputA.charAt(i) != '<'){
    			outputA = outputA + inputA.charAt(i);    			
    		}else{
    			if(outputA.length() == 0)
    				outputA = "";
    			else
    				outputA = outputA.substring(0, outputA.length() - 1);
    		}
    	}
    	
    	String outputB = "";
    	for(int i = 0; i < inputB.length(); i++){
    		if(inputB.charAt(i) != '<'){
    			outputB = outputB + inputB.charAt(i);    			
    		}else{
    			if(outputB.length() == 0)
    				outputB = "";
    			else
    				outputB = outputB.substring(0, outputB.length() - 1);
    		}
    	}
    	
    	
    	
    	if(outputA.equals(outputB))
    		return "YES";
    	else
    		return "NO";
    }
    
    public static void main(String args[]){
    	InputStream_823 obj = new InputStream_823();
    	
    	String inputA = "a<<bc";
    	String inputB = "abc<";
    	
    	System.out.print(obj.inputStream(inputA, inputB));
    	
    	
    }
}