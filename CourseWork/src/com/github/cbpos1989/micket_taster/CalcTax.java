
public class CalcTax {
	
	public static double calcTax(double tmpNum){
		
		
		double grossTmpNum = tmpNum * 1.25 / 100D; // gross tax @ 2.5% anual (6 months)
		tmpNum = tmpNum - grossTmpNum;
		
		double dirtTmpNum = tmpNum * 41D / 100D; // DIRT @ 41%
		tmpNum = tmpNum - dirtTmpNum;
		
		return tmpNum;
		
		
	}	

}
