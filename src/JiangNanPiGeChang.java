import java.util.Scanner;

public class JiangNanPiGeChang {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    System.out.println("���������:");
    String location = s.nextLine();
    System.out.println("�����빫˾����:");
    String companyCategory = s.nextLine();
    System.out.println("�����빫˾����:");
    String companyName = s.nextLine();
    System.out.println("�������ϰ�����:");
    String bossName = s.nextLine();
    System.out.println("��������:");
    String money = s.nextLine();
    System.out.println("�������Ʒ:");
    String product = s.nextLine();
    System.out.println("������۸������λ:");
    String unit = s.nextLine();
    String model = "%s���%s%s�����ˣ����˵��ϰ�%s�Ժ��ζģ�Ƿ����%s���ڣ�\r\n"
            + "��������С��������!����û�а취������%s�ֹ���!ԭ�۶���һ%s�ࡢ��%s�ࡢ��%s���%s��\r\n"
            + "����ȫ��ֻ����ʮ�飬ͳͳֻҪ��ʮ��!%s���˵����㲻����!����������������˴���꣬\r\n"
            + "�㲻�����ʣ��㻹��Ѫ��Ǯ������Ѫ��Ǯ!";        
    System.out.format(model, location,companyCategory,companyName,bossName,money,product,unit,unit,unit,product,bossName);
     
	
	
}
}
