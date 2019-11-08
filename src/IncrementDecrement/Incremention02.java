package IncrementDecrement;

public class Incremention02 {

	public static void main(String[] args) {

        int pears = 3;
        int basket = ++pears *5 / pears-- + --pears;      //  4*5/4  + 2
        System.out.println("The value of the basket is; " + basket);
    }
}