package digit;

import java.util.Arrays;

public class PaiXuChar {
	public static void main(String[] args) {
		String []ss = new String[8];
		for(int i =0;i<ss.length;i++){
			String randomString = randomString(5);
			ss[i] = randomString;
		}
		System.out.println("冒泡排序前的数组：");
		System.out.println(Arrays.toString(ss));
		
		for(int j=0;j<ss.length;j++){
			for(int i=0;i<ss.length-1-j;i++){
				char firstChar1 = ss[i].charAt(0);
				char firstChar2 = ss[i+1].charAt(0);
				firstChar1 = Character.toLowerCase(firstChar1);
				firstChar2 = Character.toLowerCase(firstChar2);
				
				if(firstChar1>firstChar2){
					String temp = ss[i];
					ss[i] = ss[i+1];
					ss[i+1]=temp;
				}
			}
		}
		System.out.println("冒泡排序后的字符串数组:");
        System.out.println(Arrays.toString(ss));
	}
	
	public static String randomString(int length){
		String pool = "";
		for(int i = '0';i<='9';i++){
			pool += (char)i;
		}
		for(int i = 'a';i<='z';i++){
			pool += (char)i;
		}
		for(int i = 'A';i<='Z';i++){
			pool += (char)i;
		}
		
		char []cs = new char[length];
		for(int i=0;i<cs.length;i++){
			int index = (char) (Math.random()*pool.length());
			cs[i] = pool.charAt(index);
		}
		String result = new String(cs);
		return result;
	}
}
