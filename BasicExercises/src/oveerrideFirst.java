
public class oveerrideFirst {
 public static void main(String[] args) {
	 
	 class Animal {				
		    void makeSound() {				
		        System.out.println("Some sound...");				
		    }				
		}				
						
		class Dog extends Animal {				
			 @Override
			 void makeSound() {
				 System.out.println("ワンワン");
			 }			
		}				
						
		class Cat extends Animal {
			@Override
			void makeSound() {
				System.out.println("ニャーニャー");
			}
		}				
	 
	 
	 
 }
}
