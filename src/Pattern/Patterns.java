/**
#                    # # # # # # # #      # # # # # # # #                    #
# #                  # # # # # # #          # # # # # # #                  # #
# # #                # # # # # #              # # # # # #                # # #
# # # #              # # # # #                  # # # # #              # # # #
# # # # #            # # # #                      # # # #            # # # # #
# # # # # #          # # #                          # # #          # # # # # #
# # # # # # #        # #                              # #        # # # # # # #
# # # # # # # #      #                                  #      # # # # # # # #
     (a)                   (b)                  (c)                  (d)
    
# # # # # # #    # # # # # # #    # # # # # # #    # # # # # # #    # # # # # # #
#           #      #                        #        #       #      # #       # #
#           #        #                    #            #   #        #   #   #   #
#           #          #                #                #          #     #     #
#           #            #            #                #   #        #   #   #   #
#           #              #        #                #       #      # #       # #
# # # # # # #    # # # # # # #    # # # # # # #    # # # # # # #    # # # # # # #
     (e)               (f)             (g)              (h)              (i)
 */
package Pattern;

public class Patterns {
	public static void main(String[] args) {
		String s = "#";
		for(int i = 1; i <= 8; i++) {
			System.out.println(s);
			s = s + "#";
		}
	}

}