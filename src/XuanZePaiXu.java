
public class XuanZePaiXu {
	
	public static void main(String[] args) {
		int []a = new int[]{18,62,68,82,65,9};
		for(int i = 0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=1;i<a.length;i++){
			if(a[i]<a[0]){
				int box = a[0];
				a[0] = a[i];
				a[i] = box;
			}
		}
		
		for(int i =2 ;i<a.length;i++){
			if(a[i]<a[1]){
				int box = a[1];
				a[1] = a[i];
				a[i] = box;
			}
		}
		
		for(int j=0;j<a.length-1;j++){
			for(int i=j+1;i<a.length;i++){
				if(a[i]<a[j]){
					int box = a[j];
					a[j] = a[i];
					a[i] = box;
				}
			}
		}
		//´òÓ¡
		 for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i] + " ");
		 }
	}
}
