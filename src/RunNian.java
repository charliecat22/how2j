import java.util.Scanner;

public class RunNian {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int year = s.nextInt();
	if((0 == year%4 && 0 != year%100)||(0 == year%400)){
		System.out.println(year+"是闰年。");
	}else{
		System.out.println(year+"不是闰年。");
	}
}
}
