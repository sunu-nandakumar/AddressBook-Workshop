package workShop.workshopAddressBook;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	Scanner scanner = new Scanner(System.in);
	ArrayList<Contacts> personList = new ArrayList<Contacts>();
	public static void main(String[] args) {
		
		Main main = new Main();
		main.add();

	}

	public  void add() {
		System.out.println("Enter your first name");
		String firstName = scanner.nextLine();
		System.out.println("Enter your last name");
		String lastName = scanner.nextLine();
		System.out.println("Enter your address");
		String address = scanner.nextLine();
		System.out.println("Enter your city");
		String city = scanner.nextLine();
		System.out.println("Enter your state");
		String state = scanner.nextLine();
		System.out.println("Enter your phone");
		String phonenumber = scanner.nextLine();
		System.out.println("Enter your zip code");
		String zipcode = scanner.nextLine();
		System.out.println("Enter the email");
		String email = scanner.nextLine();

		Contacts person1 = new Contacts(firstName, lastName, address, city, state, phonenumber, zipcode,email);
		personList.add(person1);
		System.out.println("Contact added successfully");
	}
	public void display() {
		for (int i = 0; i < personList.size(); i++) {
			Contacts person = personList.get(i);
			System.out.println("FirstName:" + person.getFirstName() + "\n" + "LastName:" + person.getLastName() + "\n"
					+ "Adress:" + person.getAddress() + "\n" + "City:" + person.getCity() + "\n" + "State:"
					+ person.getCity() + "Phone-Number:" + person.getPhonenumber() + "\n" + "Pin-code:"
					+ person.getZipcode());
		}
	}

}
