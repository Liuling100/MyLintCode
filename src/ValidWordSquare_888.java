

public class ValidWordSquare_888 {
    /**
     * @param words: a list of string
     * @return: a boolean
     */
    public boolean validWordSquare(String[] words) {
        // Write your code here
    	int column = Integer.MIN_VALUE;
    	for(int i = 0; i < words.length; i++){
    		column = words[i].length() > column ? words[i].length() : column;
    	}
    	
    	char[][] matrix = new char[words.length][column];
    	for(int i = 0; i < matrix.length; i++){
    		for(int j = 0;  j < words[i].length(); j++){
    			matrix[i][j] = words[i].charAt(j);
    		}
    	}
    	
    	for(int i = 0; i < words.length; i++){
    		for(int j = 0; j < column; j++){
	    		if(matrix[i][j] != matrix[j][i])
	    			return false;
    		}
    	}
    	
    	
    	return true;
    }
    
    public static void main(String args[]){
    	ValidWordSquare_888 obj = new ValidWordSquare_888();
    	
    	String[] words = {
    			"abcd",
    			  "bnrt",
    			  "crm",
    			  "dt"
    	};
    	
    	System.out.println(obj.validWordSquare(words));
    }
}