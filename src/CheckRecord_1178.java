
public class CheckRecord_1178 {
	/**
     * @param s: a string
     * @return: whether the student could be rewarded according to his attendance record
     */
    public boolean checkRecord(String s) {
        // Write your code here
    	 return !s.matches(".*A.*A.*") && !s.matches(".*LLL.*");
    }
    
    public static void main(String args[]){
    	CheckRecord_1178 obj = new CheckRecord_1178();
    	String s = "PPALLL";
    	System.out.println(obj.checkRecord(s));
    }
}
