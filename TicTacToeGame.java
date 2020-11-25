package com.bl.tictactoe;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class TicTacToeGame {
	
	Scanner sc=new Scanner(System.in);
	public char[] board=new char[10];
	public char playerChoice;
	public char computerChoice;
	
	// Create an empty tictactoe board
	public char[] createBoard() {
		
		for(int i=1;i<board.length;i++) {
			board[i]=' ';
		}
		
		System.out.println("Created the board");
		System.out.println(board);
		return board;
	}
	//
	public void makeChoice() {
		
		System.out.println("Enter your choice(O/X): ");
		char Choice=sc.next().charAt(0);
		if(Choice=='X') {
			computerChoice='O';
		}
		else {
			computerChoice='X';
		}
		playerChoice=Choice;
		
	}
	
	// Display the current position of board
	public void displayBoard() {
		
		System.out.println("\n"+board[1]+" | "+board[2]+" | "+board[3]);
		System.out.println("___________");
		System.out.println("\n"+board[4]+" | "+board[5]+" | "+board[6]);
		System.out.println("___________");
		System.out.println("\n"+board[7]+" | "+board[8]+" | "+board[9]);
	}
	
	// User can make a move to a desired position
	public void fillBoard() {
		while(true) {
		    System.out.println("Enter the position where you want to insert: ");
		    int pos=sc.nextInt();
		    sc.nextLine();
		    if(board[pos]!=' ') {
		    	System.out.println("Space not available! Select another position");
		    }
		    else {
		    	board[pos]=playerChoice;
		    	break;
		    }
		}
	}
	public void toss() {
		int tossRes=ThreadLocalRandom.current().nextInt(0,2);
		System.out.println("Toss Res: "+tossRes);
		if(tossRes==0) {
			playerChoice='O';
			computerChoice='X';
			System.out.println("Computer Plays First");
		}
		else {
			playerChoice='X';
		    computerChoice='O';
		    System.out.println("Player Plays First");
		}
	}

	public int checkStatus() {
		if((board[1]==computerChoice && board[2]==computerChoice && board[3]==computerChoice)||
				(board[4]==computerChoice && board[5]==computerChoice && board[6]==computerChoice)||
				(board[7]==computerChoice && board[8]==computerChoice && board[9]==computerChoice)||
				(board[1]==computerChoice && board[4]==computerChoice && board[7]==computerChoice)||
				(board[2]==computerChoice && board[5]==computerChoice && board[8]==computerChoice)||
				(board[3]==computerChoice && board[6]==computerChoice && board[9]==computerChoice)||
				(board[1]==computerChoice && board[5]==computerChoice && board[9]==computerChoice)||
				(board[3]==computerChoice && board[5]==computerChoice && board[7]==computerChoice)) {
			System.out.println("Sorry Computer Won");
			return -1;
		}
		else if((board[1]==playerChoice && board[2]==playerChoice && board[3]==playerChoice)||
				(board[4]==playerChoice && board[5]==playerChoice && board[6]==playerChoice)||
				(board[7]==playerChoice && board[8]==playerChoice && board[9]==playerChoice)||
				(board[1]==playerChoice && board[4]==playerChoice && board[7]==playerChoice)||
				(board[2]==playerChoice && board[5]==playerChoice && board[8]==playerChoice)||
				(board[3]==playerChoice && board[6]==playerChoice && board[9]==playerChoice)||
				(board[1]==playerChoice && board[5]==playerChoice && board[9]==playerChoice)||
				(board[3]==playerChoice && board[5]==playerChoice && board[7]==playerChoice)) {
			System.out.println("Player Won!!!");
			return 2;
		}
		else {
			if(board[1]!=' ' && board[2]!=' ' && board[3]!=' ' && board[4]!=' ' && board[5]!=' ' && board[6]!=' ' && board[7]!=' ' && board[8]!=' ' && board[9]!=' ') {
				System.out.println("Game is drawn!");
				return 1;
			}
			System.out.println("Change turn!");
			return 0;
		}
    }
	
	public void computerPlay() {
		if(board[1]==computerChoice && board[2]==computerChoice) {
			board[3]=computerChoice;
		}
		else if(board[2]==computerChoice && board[3]==computerChoice) {
			board[1]=computerChoice;
		}
		else if(board[1]==computerChoice && board[3]==computerChoice) {
			board[2]=computerChoice;
		}
		else if(board[4]==computerChoice && board[5]==computerChoice) {
			board[6]=computerChoice;
		}
		else if(board[5]==computerChoice && board[6]==computerChoice) {
			board[4]=computerChoice;
		}
		else if(board[4]==computerChoice && board[6]==computerChoice) {
			board[5]=computerChoice;
		}
		else if(board[7]==computerChoice && board[8]==computerChoice) {
			board[9]=computerChoice;
		}
		else if(board[8]==computerChoice && board[9]==computerChoice) {
			board[7]=computerChoice;
		}
		else if(board[7]==computerChoice && board[9]==computerChoice) {
			board[8]=computerChoice;
		}
		else if(board[1]==computerChoice && board[4]==computerChoice) {
			board[7]=computerChoice;
		}
		else if(board[1]==computerChoice && board[7]==computerChoice) {
			board[4]=computerChoice;
		}
		else if(board[7]==computerChoice && board[4]==computerChoice) {
			board[1]=computerChoice;
		}
		else if(board[2]==computerChoice && board[5]==computerChoice) {
			board[8]=computerChoice;
		}
		else if(board[5]==computerChoice && board[8]==computerChoice) {
			board[2]=computerChoice;
		}
		else if(board[2]==computerChoice && board[8]==computerChoice) {
			board[5]=computerChoice;
		}
		else if(board[3]==computerChoice && board[6]==computerChoice) {
			board[9]=computerChoice;
		}
		else if(board[6]==computerChoice && board[9]==computerChoice) {
			board[3]=computerChoice;
		}
		else if(board[3]==computerChoice && board[9]==computerChoice) {
			board[6]=computerChoice;
		}
		else if(board[1]==computerChoice && board[5]==computerChoice) {
			board[9]=computerChoice;
		}
		else if(board[5]==computerChoice && board[9]==computerChoice) {
			board[1]=computerChoice;
		}
		else if(board[1]==computerChoice && board[9]==computerChoice) {
			board[5]=computerChoice;
		}
		else if(board[3]==computerChoice && board[5]==computerChoice) {
			board[7]=computerChoice;
		}
		else if(board[5]==computerChoice && board[7]==computerChoice) {
			board[3]=computerChoice;
		}
		else if(board[3]==computerChoice && board[7]==computerChoice) {
			board[5]=computerChoice;
		}
		
		
		else if(board[1]==playerChoice && board[2]==playerChoice) {
			board[3]=computerChoice;
		}
		else if(board[2]==playerChoice && board[3]==playerChoice) {
			board[1]=computerChoice;
		}
		else if(board[1]==playerChoice && board[3]==playerChoice) {
			board[2]=computerChoice;
		}
		else if(board[4]==playerChoice && board[5]==playerChoice) {
			board[6]=computerChoice;
		}
		else if(board[5]==playerChoice && board[6]==playerChoice) {
			board[4]=computerChoice;
		}
		else if(board[4]==playerChoice && board[6]==playerChoice) {
			board[5]=computerChoice;
		}
		else if(board[7]==playerChoice && board[8]==playerChoice) {
			board[9]=computerChoice;
		}
		else if(board[8]==playerChoice && board[9]==playerChoice) {
			board[7]=computerChoice;
		}
		else if(board[7]==playerChoice && board[9]==playerChoice) {
			board[8]=computerChoice;
		}
		else if(board[1]==playerChoice && board[4]==playerChoice) {
			board[7]=computerChoice;
		}
		else if(board[1]==playerChoice && board[7]==playerChoice) {
			board[4]=computerChoice;
		}
		else if(board[7]==playerChoice && board[4]==playerChoice) {
			board[1]=computerChoice;
		}
		else if(board[2]==playerChoice && board[5]==playerChoice) {
			board[8]=computerChoice;
		}
		else if(board[5]==playerChoice && board[8]==playerChoice) {
			board[2]=computerChoice;
		}
		else if(board[2]==playerChoice && board[8]==playerChoice) {
			board[5]=computerChoice;
		}
		else if(board[3]==playerChoice && board[6]==playerChoice) {
			board[9]=computerChoice;
		}
		else if(board[6]==playerChoice && board[9]==playerChoice) {
			board[3]=computerChoice;
		}
		else if(board[3]==playerChoice && board[9]==playerChoice) {
			board[6]=computerChoice;
		}
		else if(board[1]==playerChoice && board[5]==playerChoice) {
			board[9]=computerChoice;
		}
		else if(board[5]==playerChoice && board[9]==playerChoice) {
			board[1]=computerChoice;
		}
		else if(board[1]==playerChoice && board[9]==playerChoice) {
			board[5]=computerChoice;
		}
		else if(board[3]==playerChoice && board[5]==playerChoice) {
			board[7]=computerChoice;
		}
		else if(board[5]==playerChoice && board[7]==playerChoice) {
			board[3]=computerChoice;
		}
		else if(board[3]==playerChoice && board[7]==playerChoice) {
			board[5]=computerChoice;
		}
		
		else if((board[1]==' ')||(board[3]==' ')||(board[7]==' ')||(board[9]==' ')) {
			int rand1=ThreadLocalRandom.current().nextInt(1,5);
			if(rand1==1) {
				board[1]=computerChoice;
			}
			else if(rand1==2) {
				board[3]=computerChoice;
			}
			else if(rand1==3) {
				board[7]=computerChoice;
			}
			else if(rand1==4) {
				board[9]=computerChoice;
			}
		}
	}
	
				
	public static void main(String[] args) {
		
		System.out.println("******** Welcome to TicTacToeGame **********");
		TicTacToeGame obj=new TicTacToeGame();
		obj.createBoard();
		obj.toss();
		System.out.println("Player choice: "+obj.playerChoice);
		System.out.println("Computer choice: "+obj.computerChoice);
		obj.board[5]=obj.playerChoice;
		obj.computerPlay();
		obj.displayBoard();
	
	
		
	}
}

