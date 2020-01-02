package AAA_BasicCodings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

public class aaa  {
	
	public String[] animate (int speed, String init) {
		
		return null;
	}
	
	public static void main(String[] args)  {
		
		int speed = 1;
		String init = "RR......LL";
//		int count = init.length()/speed;
		
		List<String> lst = new ArrayList<>(Arrays.asList(init.split("")));
		List<String> lstR = new ArrayList<>();
		List<String> lstL = new ArrayList<>();
		List<String> lst2 = new ArrayList<>();
		
		for (String s : lst) 
			if (s.equals("L") ) lstR.add("."); else lstR.add(s);
		for (String s : lst) 
			if (s.equals("R") ) lstL.add("."); else lstL.add(s);	
		

		
//		String[] result = new String[count];
		
		while ( lstR.contains("R") || lstL.contains("L") ) {
				
			for (int i = lstR.size()-1; i >= 0 ; i--) {
				if (i>=speed) lstR.set(i, lstR.get(i-speed));
				else lstR.set(i,".");
			}
			
			for (int j = 0; j < lstL.size() ; j++) {
				if(j<lstL.size()-speed)   lstL.set(j, lstL.get(j+speed));
				else lstL.set(j,".");
			}
			
			
			for (int k = 0; k < lst.size() ; k++) {
				if (lstL.get(k).equals("L") || lstR.get(k).equals("R")) lst2.add("X");
				else lst2.add(".");
			}
			
			System.out.println(lst2);
			System.out.println();
	
			lst2.clear();

		
		}
		
	}
		
}
