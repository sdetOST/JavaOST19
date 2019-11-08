package Array;

public class P12_Arrays_ForEachLoop {
	
	public static void main(String[] args) {
		
		String[] userName = {
				"Kevin", "Bob", "Dillion", "Jackson", "Cidney", "Kate", "Jessica"
		};
		for (String un : userName) {
			System.out.println(un);
			}
		
		for(int i=0; i<7;i++)
			System.out.print(userName[i]+", ");
	}

}
