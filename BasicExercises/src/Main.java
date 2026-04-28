
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
		
//		stu2.plus();
//		stu2.ave();
		
		
		Person2 per2 = new Person2("田中夏弥",22);
		
		per2.displayInfo();
		
		Player p1 = new Player();
		Player p2 = new Player();
		
		System.out.println("初期状態");
		System.out.println("p1.hp" + p1.hp);
		System.out.println("p2.hp" + p2.hp);
		
		p1.hp -= 30;
		
		System.out.println("\nダメージ後");
		System.out.println("p1.hp" + p1.hp);
		System.out.println("p2.hp" + p2.hp);
		
		
		PersonOverr personAge = new PersonOverr("山田太郎",25);
		
		System.out.println(personAge.toString());
		
		
		 EmployeeOverr e1 = new EmployeeOverr(100, "Tanaka");
	        EmployeeOverr e2 = new EmployeeOverr(100, "Suzuki");
	        EmployeeOverr e3 = new EmployeeOverr(200, "Sato");

	        System.out.println(e1.equals(e2));
	        System.out.println(e1.equals(e3)); 

		
		RectangleOverl sq = new RectangleOverl(6);
		RectangleOverl sq2 = new RectangleOverl(6,9);
		
		System.out.println(sq);
		System.out.println(sq2);   
	        
	      
	       plusOverl pl = new plusOverl(49, 29); 
	       plusOverl pl2 = new plusOverl(11, 76);  
	        
	       pl.showPlus();
	       pl2.showPlus(); 
	       
	       
	       Thread t = new Thread(new Runnable() {
	    	   @Override
	    	   public void run() {
	    		   System.out.println("Hello, World");
	    	   }
	       });
	       
	       t.start();
	       
	       double a = 12.34;
	       int aa = (int)a;
	       
	       System.out.println(a);
	       System.out.println(aa);
	       
	       
	       castAnimal dog = new castDog();
	       
	       castDog dogg = (castDog)dog;
	       
	       dogg.cry();
	       
	       
	       castShape s1 = new castCircle(5);
	       castShape s2 = new castRectangle(4, 3);
		
	        callSpecificMethod(s1);
	        callSpecificMethod(s2);
	        
	        
	        fildCounter c1 = new fildCounter();
	        fildCounter c2 = new fildCounter();
	        fildCounter c3 = new fildCounter();
	        
	        c1.increment();
	        c2.increment();
	        c3.increment();

	        c1.showCount();
	        c2.showCount();
	        c3.showCount();
	        
	        
	        fildStudent sn1 = new fildStudent();
	        fildStudent sn2 = new fildStudent();
	        fildStudent sn3 = new fildStudent();
	        
	        sn1.showSchool();
	        sn2.showSchool();
	        sn3.showSchool();
	        
	        int x = 21;
	        int y = 33;
	        
	        int result = methodMathUtils.add(x,  y);
	        
	        System.out.println("結果：" + result);
	        
	        String text = "hello world";
	        
	        String textResult = methodStringUtils.bigText(text);
	        
	        System.out.println(textResult);
	        
	        int[] numbers = {3, 10, 7, 25, 8};
	        
	        int m = methodArryaUtils.maxNumber(numbers);
	        
	        System.out.println("最大値: " + m);
	        
	        
	        
	        
	}public static void callSpecificMethod(castShape shape) {
	        	shape.draw();
	        	
	        	if(shape instanceof castCircle) {
	        		castCircle c = (castCircle) shape;
	        		System.out.println("Circle radius" + c.getRadius());
	        	}else if(shape instanceof castRectangle) {
	        		castRectangle r = (castRectangle) shape;
	        		System.out.println("Rectangle area" + r.getArea());
	        	}
	        }
	
		
	        
}
