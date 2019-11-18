package Bingo;

public class Player {
	
	private Ticket[] tickets;
	private String name;
	private Wallet wallet;
	private static boolean bingo = false;
	private static boolean line = false;
	public Player (String name,int ticketNumber) {
		wallet = new Wallet();
		this.name = name;
		tickets=new Ticket[ticketNumber];
		for (int i = 0; i < ticketNumber; i++) {
			tickets[i]= new Ticket();
			buyTicket();
		}
	}
	@Override
	public String toString() {
		String s = name;
		s += "\n"+wallet.toString();
		for (int i = 0; i < tickets.length; i++) {
			s += "\n" +tickets[i].toString();
		}
		
		return s;
	}
	public void buyTicket() {
		wallet.buyTicket();
	}
	
	public void lane() {
		wallet.lane();
	}
	public void bingo() {
		wallet.bingo();
	}
	public void checkTickets(int num) {
		for (int i = 0 ; i < tickets.length ; i++) {
			tickets[i].checkTicket(num);
			if (tickets[i].checkLine()&& !line) {
				System.out.println(name+"Line");
				lane();
				line = true;
			}
			if (tickets[i].checkBingo()&& !bingo) {
				System.out.println(name+" doesBingo");
				bingo();
				bingo= true;
			}
		}
	}
	public static boolean isBingo() {
		return bingo;
	}
	
	
}
