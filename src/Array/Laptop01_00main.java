package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Laptop01_00main {

	public static void main(String[] args) {


		List<Laptop01_01> laps = new ArrayList<>();
		laps.add(new Laptop01_01("Dell", 16, 800));
		laps.add(new Laptop01_01("Apple", 8, 1200));
		laps.add(new Laptop01_01("Acer", 12, 700));
		
		Collections.sort(laps);
		
	}

}
