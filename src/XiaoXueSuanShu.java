import org.omg.PortableInterceptor.INACTIVE;

public class XiaoXueSuanShu {
	
	public static void main(String[] args) {
	for(int a =-100 ;a<=100 ;a++){
		for(int b=-100;b<=100;b++){
			for (int x=-100;x<+100;x++){
				for(int y=-100;y<=100;y++){
					if(a+b==8 && a+x ==14 && b+y==10 && x-y==6){
						System.out.println("a:"+a);
                        System.out.println("b:"+b);
                        System.out.println("x:"+x);
                        System.out.println("y:"+y);
					}
				}
			}
		}
	}
	}
}
