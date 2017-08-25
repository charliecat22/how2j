

public class PaiXuLianXi {
	public static void main(String[] args) {
		int []a = new int[5];
		for(int i=0;i<a.length;i++){
			a[i] = (int) (Math.random()*100);
			System.out.print(a[i]+" ");
		}
		
		for (int j = 0; j < a.length; j++) {
			for (int i = j+1; i < a.length; i++) {
				if(a[i]<a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println();
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a.length-1-j; i++) {
				if (a[i] < a[i+1]) {
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					
				}
			}
		}
		System.out.println();
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
