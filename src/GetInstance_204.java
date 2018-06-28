
public class GetInstance_204 {
	 /**
     * @return: The same instance of this class every time
     */
	public static GetInstance_204 instance = null;
	
    public static GetInstance_204 getInstance() {
        // write your code here
    	if(instance == null)
    		instance = new GetInstance_204();
		return instance;
    }
}
