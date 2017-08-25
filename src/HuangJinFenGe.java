import java.time.Year;

public class HuangJinFenGe {
	public static void main(String[] args) {
		float breakPoint = 0.618f;
		int range = 20;
		
		int answerFenzi = 0;
		int anserFemMU = 0;
		float minDiff = 100;
		for (int x = 1; x < range; x++) {
			for (int y = 1; y< range;y++){
				if(0 == x%2 & 0 == y%2){
					continue;
				}
				float value = (float)x/y;
				float diff = value - breakPoint;
				diff = diff<0?-diff:diff;
				if(diff<minDiff){
					minDiff = diff;
					anserFemMU = y;
					answerFenzi = x;
				}
			}
			
		}
		System.out.println("离黄金分割点(" + breakPoint + ")最近的两个数相处是:" + answerFenzi + "/" + anserFemMU + "="
                + ((float) answerFenzi / anserFemMU));
	}
}
