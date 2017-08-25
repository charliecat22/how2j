
public class MaoPaoPaiXu {
	public static void main(String[] args) {
		int []a = new int[]{18,62,68,82,65,9};
		for(int i = 0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		for (int j = 0; j < a.length; j++) {
			for(int i=0;i<a.length-1-j;i++){
				if (a[i]>a[i+1]) {
					int temp = a[i+1];
					a[i+1] = a[i];
					a[i] = temp;
				}
			}
		}
		
		System.out.println();
		for(int i = 0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
