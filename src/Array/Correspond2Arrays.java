package Array;
/*
Correspond two Arrays
 
 */
import java.util.Arrays;

public class Correspond2Arrays {

	public static void main(String[] args) {
		
		String[] arr1 = { "Welcome Kit", "Online-Java Programming", "Online-Software Development Lifecycle",
                "Online-Software QA Testing", "Online-Team Activity", "Online-Mentoring", "Online-Selenium",
                "Online-SQL", "Online-API Testing" };
		
		int arr2[] = { 143, 166, 168, 170, 163, 203, 169, 171, 164 };
		
		String arr3 []=new String[arr1.length];
		
		for (int i = 0; i < arr1.length; i++) {
			arr3[i]= "<"+arr1[i]+"> is <"+arr2[i]+">";
		
			}
		for(String b:arr3) {
		System.out.println(b);
		}
System.out.println("---find the course name corrosponding with the number--------------");		
		
		for (int i = 0; i < arr2.length; i++) {
			if(arr2[i]==203) {
	
				System.out.println(arr1[i]);
			}
		}
	}
	
}
	
