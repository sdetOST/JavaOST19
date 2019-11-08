package Test05;
import java.util.ArrayList;

public class Q01 {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();

		names.add("Robb");

		names.add("Bran");

		names.add("James");

		names.add("Rick");

		names.add("Bran");

		if (names.remove("Bran")) {

		names.remove("John");

		}

		System.out.println(names);
		


}

}
