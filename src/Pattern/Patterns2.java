/**
# # # # # # # # # # #                #                          #
  # # # # # # # # #                # # #                      # # #
    # # # # # # #                # # # # #                  # # # # #
      # # # # #                # # # # # # #              # # # # # # #
        # # #                # # # # # # # # #          # # # # # # # # #
          #                # # # # # # # # # # #      # # # # # # # # # # #
         (a)                        (b)                 # # # # # # # # #
                                                          # # # # # # #
                                                            # # # # #
                                                              # # #
                                                                #
                                                               (c)
   
1                    1 2 3 4 5 6 7 8                    1      8 7 6 5 4 3 2 1
1 2                    1 2 3 4 5 6 7                  2 1      7 6 5 4 3 2 1
1 2 3                    1 2 3 4 5 6                3 2 1      6 5 4 3 2 1
1 2 3 4                    1 2 3 4 5              4 3 2 1      5 4 3 2 1
1 2 3 4 5                    1 2 3 4            5 4 3 2 1      4 3 2 1
1 2 3 4 5 6                    1 2 3          6 5 4 3 2 1      3 2 1
1 2 3 4 5 6 7                    1 2        7 6 5 4 3 2 1      2 1
1 2 3 4 5 6 7 8                    1      8 7 6 5 4 3 2 1      1
     (d)                  (e)                    (f)                (g)
   
              1                    1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
            1 2 1                    1 2 3 4 5 6 7 6 5 4 3 2 1
          1 2 3 2 1                    1 2 3 4 5 6 5 4 3 2 1
        1 2 3 4 3 2 1                    1 2 3 4 5 4 3 2 1
      1 2 3 4 5 4 3 2 1                    1 2 3 4 3 2 1
    1 2 3 4 5 6 5 4 3 2 1                    1 2 3 2 1
  1 2 3 4 5 6 7 6 5 4 3 2 1                    1 2 1
1 2 3 4 5 6 7 8 7 6 5 4 3 2 1                    1
             (h)                                (i)
   
1                           1      1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
1 2                       2 1      1 2 3 4 5 6 7   7 6 5 4 3 2 1
1 2 3                   3 2 1      1 2 3 4 5 6       6 5 4 3 2 1
1 2 3 4               4 3 2 1      1 2 3 4 5           5 4 3 2 1
1 2 3 4 5           5 4 3 2 1      1 2 3 4               4 3 2 1
1 2 3 4 5 6       6 5 4 3 2 1      1 2 3                   3 2 1
1 2 3 4 5 6 7   7 6 5 4 3 2 1      1 2                       2 1
1 2 3 4 5 6 7 8 7 6 5 4 3 2 1      1                           1
             (j)                                (k)
   
              1
            2 3 2
          3 4 5 4 3
        4 5 6 7 6 5 4
      5 6 7 8 9 8 7 6 5
    6 7 8 9 0 1 0 9 8 7 6
  7 8 9 0 1 2 3 2 1 0 9 8 7 
8 9 0 1 2 3 4 5 4 3 2 1 0 9 8
             (l)
            */
package Pattern;

public class Patterns2 {
	public static void main(String[] args) {
		String s ="#";
		/*
	              #       5 spaces  i = 1  n= 6
	    		     ###      4 spaces  i = 2   n = 6
	    		    #####     3 space   i = 3
	    		  #######     2 spaces  i = 4
	    		 #########   1 space   i = 5
	    		###########  //this is done
	    		*/
		for(int i = 1; i<=6; i++) {
			//add spaces, in front of #
			for(int j = 1; j <= 6 - i; j++) {
				System.out.print("-");   //print space
			}
			System.out.println(s);
			s += "##";   //concatenating to s
		}
		
		/*
		 *        0 space ##########   decrement
		 *        1 space  spaces increment
		 */
		
		//print bottom triangle
		for(int i = 1; i <= 5; i++ ) {
			//print spaces
			for(int k = 1; k <= i; k++) {
				System.out.print("-");
			}
				
			//print (6-i) * 2-1 number of #
			for(int k = 1; k <= (6-i)*2-1; k++) {
				System.out.print("#");
			}
			System.out.println();  //start a new line  
			
		}
		
		/*
	      #       5 spaces  i = 1  n= 6
	     ###      4 spaces  i = 2   n = 6
	    #####     3 space   i = 3
	  #######     2 spaces  i = 4
	 #########   1 space   i = 5
	###########  //this is done
     
	#########	   9 #,   i = 1   ==> (6-i) * 2 -1   = 9    
     #######       7 #    i = 2   ==>  (6-2) * 2 -1 = 7
      #####        5 #    i = 3   ==> (6-3) *2 -1   = 5
       ###         3      i = 4
        #          i      i = 5
		*/
		
		
	}
	/*
	      #       5 spaces  i = 1  n= 6
	     ###      4 spaces  i = 2   n = 6
	    #####     3 space   i = 3
	  #######     2 spaces  i = 4
	 #########   1 space   i = 5
	###########   space   i = 6
	space = 6-i
	*/
}
