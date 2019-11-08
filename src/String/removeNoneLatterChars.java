package String;

public class removeNoneLatterChars {

	public static void main(String[] args) {
		String str1 = "$%^adgr tyr6545^&%  bfgrt 54%^$";

		System.out.println(removeNoneLatterChars.reverseLetters("$%^adgr tyr6545^&%  bfgrt 54%^$"));
		
//		removeNoneLatterChars str1 = new removeNoneLatterChars();
		

	}
	public static String reverseLetters(String word){
		//TODO 
		//https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
		//createa a string that contains only letters
		//I am removing all non-letter characters.
		//replcaAll takes regular expression.
		// \\W means any non-letter char
	  String onlyLetters = word.replaceAll("\\W", "");
	  //this string we are goining to return
	  String result="";
	  //index of last letter
	  int indexOfLastLetter = onlyLetters.length()-1;
	  //we need to check each and every character ins tring word
	  for(int i=0; i<word.length();i++){
	    //this is a remp variable to store char
	    char temp = word.charAt(i);
	    //we are checking if it's a letter
	    if(Character.isLetter(temp)){
	      //if so, we are taking last letter from the string only letters
	      result+=onlyLetters.charAt(indexOfLastLetter);
	      indexOfLastLetter--;
	    }else{
	      //if it's not a letter, no need to reverse (swap), put this char as it is.
	      result+=temp;
	    }
	  }
		return result;
	}
}


