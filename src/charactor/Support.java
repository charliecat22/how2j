package charactor;
public class Support extends Hero {
 
    public void heal() {
        System.out.println("���Լ���������");
    }
 
    public void heal(Hero hero) {
        System.out.println("��Ӣ�� " + hero + " ��Ѫ");
    }
 
    public void heal(Hero hero, int hp) {
        System.out.println("��Ӣ�� " + hero + " ���� " + hp + "��Ѫ");
    }
     
}