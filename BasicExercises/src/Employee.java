
public class Employee {
	
	String id;
	String name;
	int salary;
	
	Employee(String id, String name,int salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void raiseSalary(double percent) {
		salary += salary * percent / 100;
		System.out.println("昇給後の給料" + salary);
	}
	
	
	public void showSalary() {
		System.out.println("ID:" + id + "　名前:" + name + "　給与" + salary);
	}
	
}
