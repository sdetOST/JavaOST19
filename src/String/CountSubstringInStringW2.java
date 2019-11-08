package String;

public class CountSubstringInStringW2 {

	public static void main(String[] args) {
		
		System.out.println(CountSubstringInStringW2.count("abab", "abababababab")); 

	}
	
	  public static int count(String target, String sentence) {
		    int counter = 0;
		    for (int i = 0; i <= sentence.length() - target.length(); i++) {
		      String temp = sentence.substring(i, i + target.length());
		      if (temp.equals(target)) {
		        counter++;
		      }
		    }
		    return counter;
	  }

}
