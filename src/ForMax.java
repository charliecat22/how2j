
public class ForMax {
	public static void main(String[] args) {
	 int []value = new int[]{18,62,68,82,65,9};
	 for(int each:value){
		 System.out.print(each+" ");
	 }
	 
	 int max = -1;
	 for(int each : value){
		 if(each>max){
			 max = each;
		 }
	 }
	 System.out.println();
	 System.out.println(max);
	 
	 
	 
	 
	 
	 
	}
}
