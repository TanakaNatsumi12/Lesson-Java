package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlacticeTest3 {
	public static void main(String[] args) {
		
		List<String> productList = new ArrayList<String>();
		
		productList.add("シャープペンシル");
		productList.add("ボールペン");
		productList.add("リングノート");
		productList.add("クリップ");
		productList.add("消しゴム");
		
		String element1 = productList.get(1);
		
		System.out.println(element1);
		
		List<String> nameList = new ArrayList<String>();

		nameList.add("山田太郎");
		nameList.add("鈴木花子");
		nameList.add("佐藤二郎");
		nameList.add("山田太郎");
		nameList.add("高橋三郎");
		
		String element2 = nameList.get(2);
		
		System.out.println(element2);
		
		
		ArrayList<Integer> list1 = new ArrayList<>();
		
		list1.add(10);
		list1.add(15);
		list1.add(16);
		list1.add(19);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		
		list2.add(11);
		list2.add(12);
		list2.add(18);
		list2.add(20);
		
		list1.addAll(list2);
		
		Collections.sort(list1);
		
		System.out.println(list1);
		
		for(int listNumber: list1) {
			System.out.println(listNumber);
		}
		
		
		
		
		
		
		
	}

}
