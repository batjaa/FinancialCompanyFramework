package framework.factory;

import framework.customer.BaseCustomer;
import framework.customer.ICustomer;

public class CustomerFactory extends AbstractFactory<ICustomer> {
	private String	name;
	private String	street;
	private String	city;
	private String	state;
	private String	zip;
	private String	email;

	public CustomerFactory(String name, String street, String city, String state, String zip,
							String email) {
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.email = email;
	}

	@Override
	public ICustomer make() {
		item = new BaseCustomer(name, street, city, state, zip, email);
		return item;
	}

}
