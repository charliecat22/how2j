import java.util.Scanner;

public class QiGai {
	
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int day = s.nextInt();
	int sum = 0;
	int moneyEachDay = 0;
	for(int i=1 ;i<=day;i++){
		if(0 == moneyEachDay){
			moneyEachDay = 1;
		}else{
			moneyEachDay *= 2;
		}
		sum += moneyEachDay;
		System.out.println(i + " 天之后，洪帮主手中的钱总数是: " + sum);
	}
}
}
