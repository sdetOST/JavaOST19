package Break_Countinue;

public class LabelBraak {

	public static void main(String[] args) {
		
		birsey:for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 3; j++) {
	
				System.out.print(i);
				System.out.println(j);
			}
				
				if(i==2) {
					break birsey;
				
			}
		}
	}
}

