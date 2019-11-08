package If_Statements;
import java.util.Random;
public class Random_Swich {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int day = rand.nextInt(7)+1;

		String days;
		switch (day){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			
			System.out.println("Weekday");
			break;
		case 6: 
		case 7: 
			System.out.println("Weekend");
			break;
}
}
}