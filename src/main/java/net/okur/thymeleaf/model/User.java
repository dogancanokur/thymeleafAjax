package net.okur.thymeleaf.model;

public class User {

    private String name;
    private String surname;

    public User(String name, String surname) {
	this.name = name;
	this.surname = surname;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getSurname() {
	return surname;
    }

    public void setSurname(String surname) {
	this.surname = surname;
    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("User [name=");
	builder.append(name);
	builder.append(", surname=");
	builder.append(surname);
	builder.append("]");
	return builder.toString();
    }

}
