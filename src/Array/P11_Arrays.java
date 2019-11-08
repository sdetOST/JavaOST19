package Array;

public class P11_Arrays {
	
	public static void main(String[] args) {
		
	int[] userAge = new int[10];
	
	userAge[0] = 18;
	userAge[1] = 52;
	userAge[2] = 34;
	userAge[3] = 43;
	userAge[4] = 34;
	userAge[5] = 34;
	userAge[6] = 23;
	userAge[7] = 54;
	userAge[8] = 47;
	userAge[9] = 45;
	
	for (int i = 0; i < 5; i++) {
		System.out.print(userAge[i] + ", " );
		}

System.out.print("\r----------------------------------------\r");

	int[] userNumber = {111,222,333,444,555};
	
	for (int k = 0; k < 5; k++) {
		System.out.println("userNumber(" + (k+1) + "): "+userNumber[k]);
		}
System.out.print("\n----------------------------------------\n");

	String[] userName = {"Kevin", "Bob", "Dillion", "Jackson", "Cidney", "Kate", "Jessica"};
	
	for (int n = 0; n < 7; n++) {
		System.out.print(userName[n]+ "\n");
	}
	for (int m = 0; m < userName.length; m++) {
		System.out.print(userName[m]+", ");
	}
System.out.print("\n----------------------------------------\n");
	
	}
}
