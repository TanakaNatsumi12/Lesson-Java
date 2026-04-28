
public class methodArryaUtils {
	
	public static int maxNumber(int[] array) {
		int maxValue = array[0];
		
		for(int i = 1; i < array.length; i++) {
			if(array[i] > maxValue) {
				maxValue = array[i];
			}
		}
		return maxValue;
	}
}
