package charactor;


public class Hero {
	String name;
	float hp;
	float armor;
	int moveSpeed;
	
	int killed;// 送了多少次
    int kill;// 杀人次数
    int support;// 助攻次数
    int money;// 金钱
    int lastHit;// 补刀数
    int attackSpeed;// 攻击速度
    String wordAfterKill;// 杀人后说的话
    String wordAfterKiled;// 被杀后说的话
    
    
    void keng(){
    	System.out.println("你打的也忒好了吧。");
    }
    
    float getArmor(){
    	return armor;
    }
    
    void addMoveSpeed(int speed) {
		moveSpeed += speed;
	}
    
    //超神
    void legenderay(){
        System.out.println("超神了！");
    }
      
    //获取当前的血量
    float getHp(){
        return hp;
    }
      
    //回血 
    void recovery(float blood){
        hp = hp+blood;
    }
    
	public static void main(String[] args) {
		Hero garen =  new Hero();
        garen.name = "盖伦";
        garen.hp = 616.28f;
        garen.armor = 27.536f;
        garen.moveSpeed = 350;
        garen.addMoveSpeed(100);
        System.out.println(garen.moveSpeed);
        
        
        
        Hero teemo =  new Hero();
        teemo.name = "提莫";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;
		
	}
}
