package javaPlactice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class corection {
	public static void main(String[] args) {
		
		List<Integer> number = new ArrayList<>();
		
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		
		System.out.println(number);
		
		Integer element1 = number.get(1);
		
		System.out.println("1番目の要素：" +  element1);
		System.out.println(number.get(1));
		
		number.add(5);
		number.add(6);
		
		number.remove(3);
		
		System.out.println(number);
		
		Collections.swap(number, 1, 2);
		
		System.out.println(number);
		
		number.set(2, 4);
		
		System.out.println(number);
		
		number.clear();
		
		System.out.println(number);
	}
}
