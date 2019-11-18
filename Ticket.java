package Bingo;

public class Ticket {
	public static final int NUMBER_Of_PLACES = 12;
	public static final int NUM_ROWS = 3;
	public static final int NUM_COLS = 9;
	private int[][] numbers;

	public Ticket() {
		
		int maxNumber;
		numbers = new int[NUM_ROWS][NUM_COLS];
		int randomNumber;
		for (int i = 0; i < NUM_ROWS; i++) {
			for (int j = 0; j < NUM_COLS; j++) {
				switch (j) {
				case 0:
					maxNumber = 11;
					break;
				case 1:
					maxNumber = 21;
					break;
				case 2:
					maxNumber = 31;
					break;
				case 3:
					maxNumber = 41;
					break;
				case 4:
					maxNumber = 51;
					break;
				case 5:
					maxNumber = 61;
					break;
				case 6:
					maxNumber = 71;
					break;
				case 7:
					maxNumber = 81;
					break;
				case 8:
					maxNumber = 91;
					break;
				default:
					maxNumber = 2;
					break;

				}
				randomNumber = (int) (Math.random() * maxNumber);
				while (!checkNumbers(i, j, randomNumber, maxNumber)) {
					randomNumber = (int) (Math.random() * maxNumber);
				}
				numbers[i][j] = randomNumber;

			}
		}
		
		

	}
	//delete numbers
	
	
	public boolean checkNumbers(int row, int col, int number, int maxNumber) {
		if (number > maxNumber || number == 0 || number < maxNumber-10) {
			return false;
		}
		if (row > 0) {
			for (int i = 0; i <= row; i++) {
				if (numbers[i][col] == number) {
					return false;
				}
				
			}
		}
		return true;
	}
	public void checkTicket(int num) {
		for (int i = 0; i < NUM_ROWS; i++) {
			for (int j = 0; j < NUM_COLS; j++) {
				if (num == numbers[i][j]) {
					numbers[i][j]=0;
				}
			}
		}
		
	}
public boolean checkLine() {
	boolean line = false;
	for (int i = 0; i < NUM_ROWS; i++) {
		line = true;
		for (int j = 0; j < NUM_COLS; j++) {
				if (numbers[i][j]!=0) {
					line=false;
				}
		}if (line) {
			return line;
		}
	}
		return line ;
	}
	
	
	@Override
	public String toString() {
		String s ="";
		for (int i = 0; i < NUM_ROWS; i++) {
			for (int j = 0; j < NUM_COLS; j++) {
				if (numbers[i][j] == 0) {
					 s += " X ";
				}else {
					if (j == 0 && numbers[i][j] == 10) {
						s+= numbers[i][j]+" ";
					}else {
					s += " "+numbers[i][j]+" ";
					}
				}
			}
			 s += "\n";
		}
		return s;
	}

	public boolean checkBingo() {
		boolean line = false;
		for (int i = 0; i < NUM_ROWS; i++) {
			line = true;
			for (int j = 0; j < NUM_COLS; j++) {
					if (numbers[i][j]!=0) {
						line=false;
					}
			}
		}
			return line ;
		}
	
}
