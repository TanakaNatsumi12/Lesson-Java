
public class Main {
	public static void main(String[] args) {
		
		Person person = new Person("佐藤",27);
		
		
		
		person.showPerson();
		
		Book book1 = new Book();
		
		book1.title = "A";
		book1.author = "B.B";
		book1.plice = 1000;
		
		book1.showInfo();
		
		int[] score = {98,78,67,75};
		Student student = new Student("佐藤",score);
		
		student.showAverage();
		
		
		Employee ee = new Employee("728914789","佐藤",250000);
		ee.showSalary();
		
		
		ee.raiseSalary(33.3);
		
		Circle c = new Circle(5, 3.14);
		
		c.answer();
		
		Dog dog1 = new Dog();
		
		dog1.name = "太郎";
		
		dog1.showDog();
		
		Cat cat1 = new Cat();
		
		cat1.name = "ミケ";
		cat1.meow();
		
		Car n1 = new Car();
		
		n1.model = "プリウス";
		n1.speed = 50;
		
		Car n2 = new Car();
		
		n2.model = "ベンツ";
		n2.speed = 99;
		
		n1.showCar();
		n2.showCar();
		
		
		Rectangle A = new Rectangle(10,7);
		
		A.area();
		
		
		Robot robA = new Robot();
		
		robA.name = "ロボA";
		robA.action = "掃除し";
		
		Robot robB = new Robot();
		
		robB.name = "ロボB";
		robB.action = "エアコンを付け";
		
		robA.move();
		robB.move();
		
		
		Student2 stu2 = new Student2();
		
		int[] scores = {89,93,76,57};
		
		stu2.plus();
		stu2.ave();
		
		
		
		
	}
}
