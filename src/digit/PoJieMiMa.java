package digit;

public class PoJieMiMa {
	public static void main(String[] args) {
		String password = randomString(3);
		System.out.println("ÃÜÂëÊÇ£º"+password);
		
		
	}
	
	
	
	
	
	
	
	public static String randomString(int length){
		String pool = "";
		for(int i = '0'; i<'9';i++){
			pool += (char)i;
		}
		for(int i = 'a'; i<'z';i++){
			pool += (char)i;
		}
		for(int i = 'A'; i<'Z';i++){
			pool += (char)i;
		}
		
		char []cs = new char[length];
		for(int i=0;i<cs.length;i++){
			int index= (char) (Math.random()*pool.length());
			cs[i] = pool.charAt(index);
		}
		String result = new String(cs);
		return result;
	}
}
