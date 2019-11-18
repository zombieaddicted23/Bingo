package Bingo;
import java.util.Scanner;

public class Game {
	Player[] players;
	Drum drum;
	private static boolean gameOver= false;
	public Game(int playersNum) {
		drum = new Drum();
		players = new Player[playersNum];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < players.length; i++) {
			System.out.println("Enter the p" + (i + 1) + " name ");
			String nameInput = input.next();
			System.out.println("Enter a number of tickets");
			Integer numberOfTickets = input.nextInt();
			players[i] = new Player(nameInput, numberOfTickets);
		}
	}
	public void Tick() {
		int ball = drum.extractBall();
		if (ball != 0) {
			for (int i = 0 ; i < players.length ; i++) {
				players[i].checkTickets(ball);
			}
		}else {
			gameOver = true;
		}
		if(Player.isBingo()) {
			gameOver = true;
		}
	}
	public static boolean isGameOver() {
		return gameOver;
	}
	
	@Override
	public String toString() {
		String s = "";
		for (int i = 0 ; i < players.length ; i++) {
			s += "\n";
			s += players[i].toString;
		}
		return s;
	}
	
	//public void newGame() {
		
	//}
}
