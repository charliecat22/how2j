package charactor;


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
    
    
    void keng(){
    	System.out.println("����Ҳ߯���˰ɡ�");
    }
    
    float getArmor(){
    	return armor;
    }
    
    void addMoveSpeed(int speed) {
		moveSpeed += speed;
	}
    
    //����
    void legenderay(){
        System.out.println("�����ˣ�");
    }
      
    //��ȡ��ǰ��Ѫ��
    float getHp(){
        return hp;
    }
      
    //��Ѫ 
    void recovery(float blood){
        hp = hp+blood;
    }
    
	public static void main(String[] args) {
		Hero garen =  new Hero();
        garen.name = "����";
        garen.hp = 616.28f;
        garen.armor = 27.536f;
        garen.moveSpeed = 350;
        garen.addMoveSpeed(100);
        System.out.println(garen.moveSpeed);
        
        
        
        Hero teemo =  new Hero();
        teemo.name = "��Ī";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;
		
	}
}
