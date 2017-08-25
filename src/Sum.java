import java.util.Scanner;

public class Sum {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	System.out.println("第一个数是： "+a);
	int b = s.nextInt();
	System.out.println("第二个数是： "+b);
	int sum = a + b;
	System.out.println("求和： "+sum);
 	}
}
