package AAA_BasicCodings;

public class HelloooWorld {
	
	public static void main(String[] args) {
		
			System.out.println("Hello githug world.");
		
		String myString = ("Hello github world");
		String anotherString = (", my name is Homer.");
			System.out.println(myString + anotherString);
		
		String output1 = myString.concat(anotherString);    // Concatenation
			System.out.println(output1);
			
		String output2 = myString.substring(2, 4);			// Substring
			System.out.println(output2);
			
		int howLong = myString.length();
			System.out.println("The srting \"myString\" has " + howLong + " characters.");
	System.out.print("-------------------------------------\n");			
		int x = 123;
			System.out.printf("The number is %d \t",x); 	// equal to ("The number is "+ x ), "\t" for a tab for next line
			System.out.printf("The number is %d \r",x);		// "\r and \n" makes print to next line
			System.out.printf("The number is %d \n",x);
			System.out.printf("The number is %d \n",x);
	System.out.println("-------------------------------------");			
		int a = 2;
		int b = 3;		
		int sum = a + b;
		String aString = "some mesage."; 
			System.out.printf("%d plus %d equals %d and %s \n",a, b, sum, aString);
	System.out.print("-------------------------------------\r");	
		System.out.println("This is a text one one line \nand this is another line");	// \n
		System.out.println("This is a text one one line \rand this is another line");	// \r	
		System.out.println("This is a text one one line \tand this is another line");	// \t
		System.out.print("-------------------------------------\r");	
		System.out.println("Kevin says \"Hello it is a nice day!\".");					// \ be able to use quotation mark in string "..." 
	System.out.println("-------------------------------------");	
		float aFloat = 12.346f;				// pay attention to f
			System.out.printf("The value of the float is %f \r",aFloat);    // result is 12.346000
			System.out.printf("The value of the float is %.2f \n",aFloat);    // result is 12.34
		double aDouble = 56.78;
			System.out.printf("The value of the double is %f \r",aDouble);    // result is 56.780000
			System.out.printf("The value of the double is %.1f \n",aDouble);    // result is 56.8
	System.out.println("-------------------------------------");
		char aCha = 'a';
			System.out.printf("The character is \"%c\"" ,aCha);            // instead of ("The character is " + aChar)
		char aChar = 97;
		aChar++;															// Used ASCII number instead of "a"
			System.out.printf("The character is \"%c\"" ,aChar+1);    	 // 97=a, aChar++ = b, aChar+1=c
			
			
		
		
				
			
		
			
		
		
		
	
	}
}
