public class HelloWorld {
        
    String name; //姓名
        
    float hp; //血量
        
    float armor; //护甲
        
    int moveSpeed; //移动速度
     
    public HelloWorld(){
         
    }
     
    //回血
    public void huixue(int xp){
        hp = hp + xp;
        //回血完毕后，血瓶=0
        xp=0;
    }
      
    public HelloWorld(String name,float hp){
        this.name = name;
        this.hp = hp;
    }
 
    public static void main(String[] args) {
        HelloWorld teemo =  new HelloWorld("提莫",383);
        //血瓶，其值是100
        int xueping = 100;
         
        //提莫通过这个血瓶回血
         
        teemo.huixue(xueping);
         
        System.out.println(xueping);
         
    }
      
}