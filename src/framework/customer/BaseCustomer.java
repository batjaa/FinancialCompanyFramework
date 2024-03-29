package framework.customer;

import java.util.Vector;

import framework.account.IAccount;
//
//
// Generated by StarUML(tm) Java Add-In
//
// @ Project : Financial Application Framework
// @ File Name : AbstractCustomer.java
// @ Date : 4/21/2014
// @ Author : Batjargal Batbold, Jose Ardaiz, Ripon Datta
//
//

public class BaseCustomer implements ICustomer {

	private String				name;
	private String				street;
	private String				city;
	private String				state;
	private String				zip;
	private String				email;

	protected Vector<IAccount>	accounts;

	public BaseCustomer(String name, String street, String city, String state, String zip,
						String email) {
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.email = email;
		this.accounts = new Vector<IAccount>();
	}

	public void addAccount(IAccount account) {
		accounts.add(account);
		account.broadcastChange();
	}

	@Override
	public String toString() {
		StringBuilder str =
			new StringBuilder(name + "[" + email + "] has " + accounts.size() + " account(s)\n");
		for (IAccount a : accounts) {
			str.append("\t" + a + "\n");
		}
		return str.toString();
	}

	@Override
	public Vector<IAccount> getAccounts() {
		return accounts;
	}

	@Override
	public String getBill() {
		StringBuilder report = new StringBuilder();
		report.append("Name: " + getName() + "\n");
		report.append("Address: " + getAddress() + "\n");
		for (IAccount account : accounts) {

			report.append(account + "\n");
		}
		return report.toString();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getStreet() {
		return street;
	}

	@Override
	public String getCity() {
		return city;
	}

	@Override
	public String getState() {
		return state;
	}

	@Override
	public String getZip() {
		return zip;
	}

	@Override
	public String getAddress() {
		return street + ", " + city + ", " + state + ", " + zip;
	}

	@Override
	public String getEmail() {
		return email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
