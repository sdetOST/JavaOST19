package Array;

public class P13_CopyingArrays {

	public static void main(String[] args) {
		
		String[] sourceNames = {
				"Jim", "Bob", "Dillion", "Jackson", "Cidney", "Kate", "Jessica"	};
		
		String destinationNames[] = new String[3];
		System.arraycopy(sourceNames, 2, destinationNames, 0, 3);
		
//		for (int i = 0; i < 4; i++) {
//			System.out.println(destinationNames[i]);
//		}
		
		for (String dN : destinationNames) {
			System.out.println(dN);
			}
		
		
	}

}