package Bingo;

public class Wallet {
	private int cash;
	
	public Wallet() {
		cash = 5;
	}
	
	public void buyTicket() {
		cash--;
	}
	public void lane() {
		cash += 2;
	}
	public void bingo() {
		cash += 4;
	}

	@Override
	public String toString() {
		String s = "You have " +cash+"$ on the wallet";
		return s;
	}
	
}
