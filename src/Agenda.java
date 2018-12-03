import java.util.ArrayList;

public class Agenda {

	private ArrayList<Person> persons = new ArrayList<Person>();
	private ArrayList<Integer> numbers = new ArrayList<Integer>();
	private ArrayList<String> addresses = new ArrayList<String>();

	public void setNUmber(String number) {

	}

	public void setContact(Person person, int number, String address) {

		persons.add(person);
		numbers.add(number);
		addresses.add(address);

	}

	public String getContact(int index) {

		return persons.get(index).toString() + " " + numbers.get(index) + " " + addresses.get(index);

	}

	public void deleteContact(int index) {

		persons.remove(index);
		numbers.remove(index);
		addresses.remove(index);

	}

	public void modifyInfo(int index, String what, String value) {

		switch (what) {

		case "name":

			persons.get(index).setName(value);
			break;

		case "age":
			int val = Integer.parseInt(value);
			persons.get(index).setAge(val);

			break;

		case "weight":
			 val = Integer.parseInt(value);
			persons.get(index).setWeight(val);
			break;

		case "dni":

			persons.get(index).setDni(value);
			break;

		

		case "number":

			val = Integer.parseInt(value);

			numbers.remove(index);
			numbers.add(index, val);
			break;

		case "address":

	

			addresses.remove(index);
			addresses.add(index, value);
			break;

		}
	}

}