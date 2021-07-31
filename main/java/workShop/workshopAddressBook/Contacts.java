package workShop.workshopAddressBook;

public class Contacts {
 String Contacts;
 public String firstName;
 public String lastName;
 public String address;
 public String city;
 public String state;
 public String phonenumber;
 public String zipcode;
 public String email;
 Contacts(String firstName, String lastName, String address, String city, String state, String phonenumber,
         String zipcode , String email){

     this.firstName = "";
     this.lastName = "";
     this.address = "";
     this.city = "";
     this.state = "";
     this.phonenumber = "";
     this.zipcode = "";
}

public String getContacts() {
	return Contacts;
}
public void setContacts(String contacts) {
	Contacts = contacts;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}
public String getZipcode() {
	return zipcode;
}
public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Contacts [Contacts=" + Contacts + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
			+ address + ", city=" + city + ", state=" + state + ", phonenumber=" + phonenumber + ", zipcode=" + zipcode
			+ ", email=" + email + "]";
}
}
