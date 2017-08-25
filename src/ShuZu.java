
public class ShuZu {
	
public static void main(String[] args) {
	int min = 999;
	int []a = new int[5];
	for(int i=0 ; i<a.length;i++){
		a[i] = (int) (Math.random()*100);
		System.out.print(a[i]+" ");
	}
	for(int i=0;i<a.length;i++){
		int b = a[i];
		if(b<min){
			min = b;
		}
	}
	System.out.println("\n"+min);
	
	
}
}
