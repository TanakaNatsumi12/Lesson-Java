
public class Student {
	
	String name;
	int[] score;
	
	
	Student(String name,int[] score){
		this.name = name;
		this.score = score;
	}
	
	public void showAverage() {
		double sum = 0;
		for(int s: score) {
			sum += s;
		}
		double average = sum / score.length;
		System.out.println(name + "の平均点：" + average);
	}
	
	
}
