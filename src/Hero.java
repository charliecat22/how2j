

public class Hero {
	String name;
	float hp;
	float armor;
	int moveSpeed;
	
	int killed;// ���˶��ٴ�
    int kill;// ɱ�˴���
    int support;// ��������
    int money;// ��Ǯ
    int lastHit;// ������
    int attackSpeed;// �����ٶ�
    String wordAfterKill;// ɱ�˺�˵�Ļ�
    String wordAfterKiled;// ��ɱ��˵�Ļ�
    
	public static void main(String[] args) {
		Hero garen =  new Hero();
        garen.name = "����";
        garen.hp = 616.28f;
        garen.armor = 27.536f;
        garen.moveSpeed = 350;
         
        Hero teemo =  new Hero();
        teemo.name = "��Ī";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;
		
	}
}
