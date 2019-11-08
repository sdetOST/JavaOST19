package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class aaa {

	public static void main(String[] args) {
//		  ArrayList<String> list =new ArrayList<>(Arrays.asList("z", "y", "x","w", "v"));
//		   for (int i = 0; i < list.size(); i++){
//		      for (int j = 0; j < list.size(); j++)
//		      System.out.println(list.get(i)+list.get(j));		
//		    }	
		   
		   ArrayList<String> list1 = new ArrayList<>(Arrays.asList("user27","storemanager69","salesmanager128"));
		        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Useruser123","userUser123","useruser123","UserUser12","serUser123"," "));
		        for (int i = 0; i< list1.size(); i++){
		            for (int j = 0; j< list2.size(); j++){
		            		System.out.println(list1.get(i)+"--"+list2.get(j));

		            }
		        }
		   
	}
}
