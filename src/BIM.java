import java.util.Scanner;
  
public class BIM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("���������(m):");
        float height = s.nextFloat();
        System.out.println("����������(kg):");
        float weight = s.nextFloat();
        float BMI = weight / (height * height);
        System.out.println("��ǰ��BMI��: " + BMI);
  
        String status = "";
  
        if (BMI < 18.5)
            status = "���ع���";
        else if ( BMI < 24)
            status = "������Χ";
        else if (BMI < 27)
            status = "���ع���";
        else if (BMI < 30)
            status = "��ȷ���";
        else if (BMI < 35)
            status = "�жȷ���";
        else
            status = "�ضȷ���";
          
        System.out.println("����״̬��: " + status);
          
    }
}