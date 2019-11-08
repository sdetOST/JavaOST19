package Random;
import java.util.Random;
import java.util.Scanner;
class P20_05W22_Random_GameDiceChoice {
	
	public static void main(String[] args) {
		
		final int endScore=10;
	    Scanner scan = new Scanner( System.in );
	    Random rand = new Random();
	    int playerScore=0, compScore=0;
	    int playerToss, compToss , numDice ;	    
	  
	    while ( playerScore<endScore && compScore<endScore )				// Play Rounds until one player reaches ending score
	    {	      
	      compToss = rand.nextInt(6)+1 + rand.nextInt(6)+1 ;				// Computer's Toss
	      System.out.println("The Computer tosses: " + compToss);
	      
	      System.out.print("Toss 1 eleven-sided die, or 2 six-sided dice (enter 1 or 2)? ");		 // Player's Toss
	      numDice = scan.nextInt();
	      
	      while (numDice>2 || numDice < 1)
	      {
	      System.out.print("Toss 1 eleven-sided die, or 2 six-sided dice (enter 1 or 2)? ");		 // Player's Toss
	      numDice = scan.nextInt();
	      }
	      
	      if ( numDice == 1 )
	      {
	        playerToss = rand.nextInt(11)+2 ;
	        System.out.println("You throw 1 die and get: " + playerToss );
	      }
	      else 
	      {
	    	  playerToss = rand.nextInt(6)+1 + rand.nextInt(6)+1;
	    	  System.out.println("You throw 2 dice and get: " + playerToss ); 
	      }
	     
	      if ( playerToss>compToss )								// Determine Winner of Round and Adjust Scores
	      {
	        playerScore = playerScore+1;
	        System.out.println("You win the round!");
	      }
	      else
	      {
	        compScore = compScore+1;
	        System.out.println("You loose the round!");
	      }
	      
	   System.out.println("Score: computer " + compScore + ", you " + playerScore + "\n");
	    }
	    
	    System.out.println("Final Score: computer " + compScore + ", you " + playerScore);		// Determine Winner of the Game
	    
	    if ( compScore > playerScore )
	    	System.out.println("The Computer Wins!");
	    else 
	    	System.out.println("You Win the Game!");
	    	System.out.println("--------------------------------------");
	  }
	    
}