package javaPlactice;

import java.util.HashMap;
import java.util.Map;

public class fruitList {
	public static void main(String[] args) {
		
		Map<String, Integer> fruitsMap = new HashMap<>();
		
		fruitsMap.put("りんご", 100);
		fruitsMap.put("みかん", 80);
		fruitsMap.put("バナナ", 120);
		fruitsMap.put("いちご", 300);
		
		
		String want = "りんご";
		
		
		if(fruitsMap.containsKey(want)) {
			System.out.println(want + ":" + fruitsMap.get(want) + "円");
		}else {
			System.out.println("申し訳ありませんが、その商品は取り扱っておりません。");
		}
		
		
	}
}
