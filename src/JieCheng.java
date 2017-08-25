import java.util.Scanner;

public class JieCheng {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int i = s.nextInt();
	int fac = 1;
	while(i>=1){
		fac = fac * i ;
		i--;
	}
	System.out.println("½×³ËÊÇ£º "+fac);
}
}
