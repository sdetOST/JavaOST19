package IncrementDecrement;

public class Incremention03 {

	public static void main(String[] args) {
        

        int num1;
        int num2;
        int num3;
        int num4;

        num1=100;
        System.out.println(num1++);     // 100
        num2=num1++;
        System.out.println(num1);       // 102
        System.out.println(num1++);     // 102
        System.out.println(num2);       // 101

        num3=100;
        System.out.println(++num3);     // 101
        num4=num3;
        System.out.println(num3);       // 101
        System.out.println(++num3);     // 102
        System.out.println(num4);       // 101

    }
}