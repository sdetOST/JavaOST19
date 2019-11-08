package CyberInterviewQ;
/*
  Numbers -- odd & even
	Write  a method which can identifies given number is even or odd 

	EX: 	identify(5) ->  "Odd"   
		identify(6) ->  "Even"
  
 */
public class numberOddEven {

	public static void main(String[] args) {
		System.out.println(identifyOddEven( -5 ));

	}
	public  static  String  identifyOddEven( int  n ) {

		return  n%2==0 ? "Even" : "odd" ; 

		}

}
