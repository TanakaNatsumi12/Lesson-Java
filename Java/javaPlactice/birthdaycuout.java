package javaPlactice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class birthdaycuout {
	public static void main(String[] args) {
		
        LocalDate today = LocalDate.now();                 
        LocalDate birthday = LocalDate.of(2026, 12, 20);   

        long days = ChronoUnit.DAYS.between(today, birthday);

        System.out.println(days);
        
    	System.out.println("Hello\tWorld\nJava");				
	}
}
