package test;

public class Test {

	public static void main(String[] args) {
		
		Person glen = new Person("Glen", 46, 184.5);
		Person ethan = new Person("Ethan", 9, 80.0);
		Person[] vasa = {ethan, glen};
		
		printNames(vasa);
		
	}
	
	public static void printNames(Person[] people) {
		for(Person person : people) {
			System.out.println(person.name);
		}
	}

	
	
}
