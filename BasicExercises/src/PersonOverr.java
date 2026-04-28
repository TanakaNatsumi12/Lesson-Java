
public class PersonOverr {
	String name;
	int age;
	
	
	public PersonOverr(String name, int age) {
        this.name = name;
        this.age = age;
    }
	
	@Override
	public String toString() {
		return name + ":" + age;	
	}
	
	
}
