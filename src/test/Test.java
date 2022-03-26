package test;

public class Test {

	public static void main(String[] args) {
		
		Person russell = new Person("Russell", 46, 184.5);
		Person andrew = new Person("Andrew", 9, 80.0);
		Person samuel = new Person("Samuel", 13, 132.8);
		Person[] asav = {andrew, samuel, russell};
		
		printNames(asav);
		
	}
	
	public static void printNames(Person[] people) {
		for(Person person : people) {
			System.out.println(person.name + " is "+person.age+ " years old" + " and weighs "+ person.weight+ " pounds.");
		}
	}

	
	
}
