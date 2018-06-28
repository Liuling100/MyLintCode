public class JudgeCircle_1104 {
    /**
     * @param moves: a sequence of its moves
     * @return: if this robot makes a circle
     */
    public boolean judgeCircle(String moves) {
        // Write your code here
    	if(moves.length() == 0)
    		return true;
    	
    	if(moves.length() % 2 != 0)
    		return false;
    	
    	int u = 0;
    	int d = 0;
    	int l = 0;
    	int r = 0;
    	
    	for(int i = 0; i < moves.length(); i++){
    		if(moves.toUpperCase().charAt(i) == 'U')
    			++u;
    		else if(moves.toUpperCase().charAt(i) == 'D')
    			++d;
    		else if(moves.toUpperCase().charAt(i) == 'R')
    			++r;
    		else if(moves.toUpperCase().charAt(i) == 'L')
    			++l;
    	}
    	
    	return u==d && l==r;    	
    }
    
    public static void main(String args[]){
    	JudgeCircle_1104 obj = new JudgeCircle_1104();
    	String moves = "ll";
    	System.out.println(obj.judgeCircle(moves));
    }
}