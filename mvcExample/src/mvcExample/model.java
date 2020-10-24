package mvcExample;

public class model {
private String firstname;
private String lastname;


public model(String firstname,String lastname) {
	this.firstname = firstname;
	this.lastname = lastname;
}

public String getFirstname() {
	return firstname;
}

public String getLastname() {
	return lastname;
}

public void setFirstname(String firstname) {
	this.lastname = firstname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}
}
