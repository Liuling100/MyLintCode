import java.math.BigInteger;

public class AddStrings_655 {
    /**
     * @param num1: a non-negative integers
     * @param num2: a non-negative integers
     * @return: return sum of num1 and num2
     */
    public String addStrings(String num1, String num2) {
        // write your code here    	
    	String res = "";
        int m = num1.length(), n = num2.length(), i = m - 1, j = n - 1, flag = 0;
        while(i >= 0 || j >= 0){
            int a, b; 
            if(i >= 0){
                a = num1.charAt(i--) - '0';
            }else{
                a = 0;
            }
            
            if(j >= 0){
                b = num2.charAt(j--) - '0';
            }else{
                b = 0;
            }
            
            int sum = a + b + flag;
            res =(char)(sum % 10 + '0') + res;
            flag = sum / 10;
        }
        return flag == 1 ? "1" + res: res; 
    }
    
    public static void main(String args[]){
    	AddStrings_655 obj = new AddStrings_655();
    	String num1 = "9999999999981";
    	String num2 = "19";
    	
    	System.out.println(obj.addStrings(num1, num2));
    }
}