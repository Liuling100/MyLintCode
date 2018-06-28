public class CountSegments_1243 {
    /**
     * @param s: a string
     * @return: the number of segments in a string
     */
    public int countSegments(String s) {
        // write yout code here
    	String[] strs = s.split(" ");
    	int length = strs.length;
    	for(int i = 0; i < strs.length; i++){
    		if(strs[i].equals("")){
    			--length;
    		}
    	}
    	return length;
    }
    
    public static void main(String args[]){
    	CountSegments_1243 obj = new CountSegments_1243();
    	String s = "jksdhjka h kas dha hska hkjahkd hkahs ha khsk h   asdhk hak  h  hjk ahk h jahd;fk;dsl";
    	System.out.println(obj.countSegments(s));
    }
}