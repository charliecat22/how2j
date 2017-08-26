package digit;

public class CharTest {
	
	
	public static void main(String[] args) {
		String pool = "";
		for(int i = '0' ;i<='9';i++){
			pool += (char)i;
		}
		for(int i = 'a' ;i<='z';i++){
			pool += (char)i;
		}
		for(int i = 'A' ;i<='Z';i++){
			pool += (char)i;
		}
		
		char []cs = new char[5];
		for(int i=0;i<cs.length;i++){
			int index = (int) (Math.random()*pool.length());
			cs[i] = pool.charAt(index);
		}
		String str =new String(cs);
		System.out.println(str);
	}
}
