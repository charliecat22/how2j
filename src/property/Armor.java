package property;


public class Armor extends Item {
	int ac;
	
	public static void main(String[] args) {
		Armor bujia = new Armor();
		bujia.name = "²¼¼×";
		bujia.price = 300;
		bujia.ac = 15;
		
		Armor suozijia = new Armor();
		suozijia.name = "Ëø×Ó¼×";
		suozijia.price = 500;
		suozijia.ac = 40;
	}
}
