

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
    
	public static void main(String[] args) {
		Hero garen =  new Hero();
        garen.name = "盖伦";
        garen.hp = 616.28f;
        garen.armor = 27.536f;
        garen.moveSpeed = 350;
         
        Hero teemo =  new Hero();
        teemo.name = "提莫";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;
		
	}
}
