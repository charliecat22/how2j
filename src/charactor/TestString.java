package charactor;
    
public class TestString {
    
    public static void main(String[] args) {
   
        String sentence = "����,�ڽ���������8�λ�ɱ��,����� ���� �ĳƺ�";
         
        //��ȡ�ӵ�3����ʼ���ַ��� ����0��
        String subString1 = sentence.substring(3); 
         
        System.out.println(subString1);
         
        //��ȡ�ӵ�3����ʼ���ַ��� ����0��
        //��5-1��λ�õ��ַ��� 
        //����ҿ�
        String subString2 = sentence.substring(3,5); 
         
        System.out.println(subString2);
        
        
        String subSentences[] = sentence.split(",");
        for (String sub : subSentences) {
            System.out.println(sub);
        }
           
         
    }
}