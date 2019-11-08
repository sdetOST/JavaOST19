package Array;

public class P11_W2_Arrays {
	
	public static void main(String[] args) {
		
		String[] userName = {
			"Kevin", "Bob", "Dillion", "Jackson", "Cidney", "Kate", "Jessica"
		};
		for (int n = 0; n < 7; n++) {
			System.out.println(userName[n]);
		}
		System.out.print("\r");
		
		for (int m = 0; m < userName.length; m++) {
			System.out.print (userName[m] + ", ");
		}

	
	}
}
