
public class Person2 {
	String name;
	int age;
	
	Person2(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void displayInfo() {
		System.out.println("名前は" + name + "です。年齢は" + age + "です。");
	}
}
