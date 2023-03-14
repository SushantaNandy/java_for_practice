package oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

class game{
	int x,y;
	public void constr() {
		Random random = new Random(); 
		 x=random.nextInt(100);
	}
	public void takeUserInput() throws NumberFormatException, IOException {
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		System.out.println("enter your number");
		 y= Integer.parseInt(input.readLine());
	}
	public boolean isCorrectNumber() {
		if(x==y) {
			System.out.println("your guess is correct");
			return true;
		}
		else {
			if(x>y) {
				System.out.println("choose a bigger number");
			}
			else {
				System.out.println("choose a smaller number");
			}
		}
		return false;
	}
}

public class guess_the_number_game {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/* Create a class game which allows the users to play "guess the number".
		 * Games should have the following methods:-
		 * Constructors to generate the random numbers.
		 * takeUserInput() to take users input of number
		 * isCorrectNumber() to deteact weather the number entered by the user is true
		 * getter and setters for number of guess.
		 * 
		 * Use properties like numberOfGuess(int) etc to get the work done */
		game g=new game();
		g.constr(); 
		g.takeUserInput();
		g.isCorrectNumber();
		boolean b= g.isCorrectNumber();
		if(b==false) {
			for(int i=0;i<=10;i++) {
				g.takeUserInput();
				g.isCorrectNumber();
			}
		}
		
		
		 
	}

}
