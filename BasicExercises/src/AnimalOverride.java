
public class AnimalOverride {
	
	
		public void makeSound() {
			System.out.println("鳴き声");
		}
	
	
	
		public class Dog extends AnimalOverride{
			@Override
			public void makeSound() {
				System.out.println("ワンワン");
			}
		}
	
		public class Cat extends AnimalOverride{
			@Override
			public void makeSound() {
				System.out.println("ニャーニャー");
			}
		}
	
	
	
}
