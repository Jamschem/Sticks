package Sticks;
import java.util.Scanner;

public class Sticks {

public static void main(String[] args) {
			
			
	Scanner reader = new Scanner (System.in);
	int sticks = (int)(Math.random()*10 + 21);
	System.out.println("There are " + sticks + " sticks");
	System.out.println("Select 1 to go first or select 2 to go second");
	boolean turn; //True is player, False is computer
	if(reader.nextInt() == 1)
			turn = true;
	else
			turn = false;
		
		//game stops when sticks = 0, so keep running as long as you have stick
	while(sticks > 0) {
		if (turn)
			sticks = playerMove(sticks, reader);
		else 
			sticks = computerMove(sticks);
	System.out.println("There are now " + sticks + " sticks left.");
	if(sticks == 0 && turn) //You win
		System.out.println("You win!!");
	if(sticks == 0 && !turn) //Computer wins
		System.out.println("You lose!!");
	turn = !turn;
		}
	}
		//must return value
		//2 input parameters, S (= # of sticks), and reader
		public static int playerMove(int sticks, Scanner reader){
			System.out.println("Select how many sticks to remove");
			int take = reader.nextInt();
			if(take < 1)
				take = 1;
			if(take > 3)
				take = 3;
			else if(take > sticks)
				take = sticks;
			System.out.println("you took " + sticks + " sticks");
			return sticks - take;
			
		}
		
		public static int computerMove(int sticks) {
			int take;
			if(sticks % 4 != 0) //not multiple
				take = sticks % 4;
			else //is multiple
				take = (int)(Math.random()*3) + 1;	
			System.out.println("The computer took " + take + " sticks");
			return sticks - take;
	}
}


