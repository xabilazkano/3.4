
public class Main {

	public static void main(String[] args) {
		Person pertsona = new Person();
		Person persona = new Person("Peru",3344,2332,"dffed");
		pertsona.setContact(pertsona, 324324, "address");
		pertsona.setContact(persona, 4354, "address");
		
		System.out.println(pertsona.getContact("example"));



	}

}
