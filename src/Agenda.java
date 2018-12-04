import java.util.ArrayList;

public class Agenda {

	private ArrayList<Person> persons = new ArrayList<Person>();
	private ArrayList<Integer> numbers = new ArrayList<Integer>();
	private ArrayList<String> addresses = new ArrayList<String>();
	
	public int index(String name) {
		int index=100;
		for (int i=0;i<persons.size();i++) {
			if (persons.get(i).getName().matches(name)) {
				 index=i;
				 break;
			}
		}
		
		
		return index;
	}

	public void setNUmber(String number) {

	}

	public void setContact(Person person, int number, String address) {

		persons.add(person);
		numbers.add(number);
		addresses.add(address);

	}

	public String getContact(String name) {

		return persons.get(index(name)).tostring() + " " + numbers.get(index(name)) + " " + addresses.get(index(name));

	}

	public void deleteContact(String name) {

		persons.remove(index(name));
		numbers.remove(index(name));
		addresses.remove(index(name));

	}

	public void modifyInfo(String name, String what, String value) {

		switch (what) {

		case "name":

			persons.get(index(name)).setName(value);
			break;

		case "age":
			int val = Integer.parseInt(value);
			persons.get(index(name)).setAge(val);

			break;

		case "weight":
			 val = Integer.parseInt(value);
			persons.get(index(name)).setWeight(val);
			break;

		case "dni":

			persons.get(index(name)).setDni(value);
			break;

		

		case "number":

			val = Integer.parseInt(value);

			numbers.remove(index(name));
			numbers.add(index(name), val);
			break;

		case "address":

	

			addresses.remove(index(name));
			addresses.add(index(name), value);
			break;

		}
	}

}