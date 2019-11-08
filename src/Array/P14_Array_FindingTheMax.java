package Array;

public class P14_Array_FindingTheMax {

	public static void main(String[] args) {

		int [] myNumber = {1,9,2,8,3,7,4,7,24,5,4,6,10};
		int max = 0;
		
				
		for (int i = 0; i < myNumber.length; i++) {
			
			if(myNumber[i]>max) 
				max=myNumber[i];
		}
		System.out.printf("The myNumber length is %d\n",myNumber.length);
		System.out.printf ("The max number is %d\n",max );
	
System.out.println("------------------------------------------------------"); 	
		int [] myArray = {1,9,2,8,3,45};
		int maxx = 0;
		int k = 0;
				
		while (k < myArray.length) {
			
			if(myArray[k]>maxx) 
				maxx=myArray[k];
			k++;
		}
		
		System.out.printf("The maxx number is %d ",maxx);
		
	}
}

