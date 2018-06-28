
public class IsValidSudoku_389 {
	/**
     * @param board: the board
     * @return: whether the Sudoku is valid
     */
    public boolean isValidSudoku(char[][] board) {
        // write your code here
    	if(board == null || board.length != board[0].length || board.length % 3 != 0)
    		return false;
    	
    	int width = board.length;
    	int height = board[0].length;
    	int numsBoard = width / 3;
    	
    	for(int i = 0; i < width; i++){
    		for(int j = 0; i < height; j++){
    			char a = board[i][j];
    			if(a != '.' || Integer.parseInt(String.valueOf(a)) < 0 || Integer.parseInt(String.valueOf(a)) >9)
    				return false;
    			else{
    				
    			}
    		}
    	}
    	
    	
    	return true;
    }
    
    public static void main(String args[]){
    	IsValidSudoku_389 obj = new IsValidSudoku_389();
    	
    	char[][] board = new char[6][6];
    	board[0][0] = '8';
    	board[0][1] = '.';
    	board[0][2] = '.';
    	board[0][3] = '.';
    	board[0][4] = '6';
    	board[0][5] = '.';
    	
    	board[1][0] = '4';
    	board[1][1] = '.';
    	board[1][2] = '.';
    	board[1][3] = '8';
    	board[1][4] = '.';
    	board[1][5] = '3';
    	
    	board[2][0] = '7';
    	board[2][1] = '.';
    	board[2][2] = '.';
    	board[2][3] = '.';
    	board[2][4] = '2';
    	board[2][5] = '.';
    	
    	board[3][0] = '.';
    	board[3][1] = '6';
    	board[3][2] = '.';
    	board[3][3] = '.';
    	board[3][4] = '.';
    	board[3][5] = '.';
    	
    	board[4][0] = '.';
    	board[4][1] = '6';
    	board[4][2] = '.';
    	board[4][3] = '.';
    	board[4][4] = '.';
    	board[4][5] = '.';
    	
    	board[5][0] = '.';
    	board[5][1] = '.';
    	board[5][2] = '.';
    	board[5][3] = '4';
    	board[5][4] = '1';
    	board[5][5] = '9';
    	
    	System.out.println(obj.isValidSudoku(board));
    }
}
