package If_Statements;
/**
 *  if-else example
 */
public class Test {
    public static void main(String args[]) {
        int  a = 110;
        int b = 20;
        int c = 0;
        if(!(a < b)){
            if(a % 2 != 0 ){
                c = 100;
            }else{
                c = 200;
            }
            c = 99;
        }
        System.out.println(c);
        
    }
}
