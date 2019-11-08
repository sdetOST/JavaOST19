package LogicalOperators;

public class LogicalOperations01 {

	public static void main(String[] args) {
        
		System.out.println(!(false) || true && false); // TorTandF // TorF // T
        System.out.println(!(false) && true || false); // TandTorF // TorF // T
        boolean bool = !(1 < 8 && (5>2 || 3 < 5));     // (Tand(TorT))'//(TandT)'//T'//F
        System.out.println("The value of bool is: " + bool);
    }
}