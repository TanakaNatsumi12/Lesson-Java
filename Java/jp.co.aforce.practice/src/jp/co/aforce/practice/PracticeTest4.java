package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class PracticeTest4 {
	public static void main(String[] args) {
		
		List<String> animals = new ArrayList<String>();
		
		animals.add("犬");
		animals.add("猫");
		animals.add("うさぎ");
		animals.add("へび");
		
		String myFavorite = "かば";
		
		if(myFavorite.equals(animals)) {
			System.out.println(myFavorite + "はリストに含まれています");
		}else {
			System.out.println(myFavorite + "はリストに含まれていません");
		}
		
		Calendar cl = Calendar.getlnstance();
		
		int month = cl.get(Calendar.MONTH) + 1;
		
		
		
		
	}
	
}
