package framework.customer;

import java.util.Vector;

import framework.FinancialCompanyApplication;
import framework.IFunctor;
import framework.account.IAccount;

public class CustomerManager {
	private FinancialCompanyApplication	context;
	private Vector<ICustomer>			customers;

	public CustomerManager(FinancialCompanyApplication context) {
		this.context = context;
		this.customers = new Vector<ICustomer>();
	}

	public void addCustomer(ICustomer customer) {
		if (!customers.contains(customer)) customers.add(customer);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void forEach(IFunctor f) {
		for (ICustomer customer : customers)
			f.process(customer);
	}

	public Vector<ICustomer> searchBy(SearchByFunctor<ICustomer> f) {
		for (ICustomer customer : customers)
			f.process(customer);
		return f.getResult();
	}

	public Vector<IAccount> searchByAccount(SearchByFunctor<IAccount> f) {
		for (ICustomer customer : customers)
			for (IAccount account : customer.getAccounts())
				f.process(account);
		return f.getResult();
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("Customers:\n");
		for (ICustomer c : customers) {
			str.append(c.toString() + "\n");
		}
		return str.toString();
	}

	public Vector<ICustomer> getCustomers() {
		return customers;
	}

	public FinancialCompanyApplication getContext() {
		return context;
	}

}
