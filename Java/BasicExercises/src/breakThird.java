
public class breakThird {
	public static void main(String[] args) {
		
		int[][] row = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		boolean found = false;
		
		serch:
		for(int i = 0; i < row.length; i++) {
			for(int j = 0; j <row[i].length;j++) {
				
				if(row[i][j] == 5) {
					System.out.println("５を発見しました");
					found = true;
					break serch;	
				}
			}
		}
	if(!found) {
					System.out.println("５は見つかりませんでした");
				}	
		
		
	}
}
