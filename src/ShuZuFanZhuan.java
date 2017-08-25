
public class ShuZuFanZhuan {
	public static void main(String[] args) {
		int []a = new int[5];
		for(int i=0;i<a.length;i++){
			a[i] = (int) (Math.random()*100);
			System.out.print(a[i]+" ");
		}
		
		for (int i =0;i< a.length/2;i++){
			int x = a[a.length-1-i];
			a[a.length-1-i] =a[i];
			a[i] =x;
		}
		System.out.println();
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
