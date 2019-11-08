package Switch;

public class Swich {

	public static void main(String[] args) {

		int restaurantRating = 2;
		
		switch(restaurantRating){
		case 1:
			System.out.println("This restaurant is not my fevorite.");
			break;
		case 2:
			System.out.println("This restaurant is good.");
			break;
		case 3:
			System.out.println("This restaurant is fantastic.");
			break;
		default:
			System.out.println("I have never been at that restaurant.");
			break;
		}
System.out.println("-------------------------------------------------");

		char restRating = 'C';
		switch(restRating){
		case 'C':
		case 'D':
		case 'E':
			System.out.println("This restaurant is not my fevorite.");
			break;
		case 'B':
			System.out.println("This restaurant is good.");
			break;
		case 'A':
			System.out.println("This restaurant is fantastic.");
			break;
		default:
			System.out.println("I have never been at that restaurant.");
			break;
		}
System.out.println("-------------------------------------------------");		
				
	}

}
