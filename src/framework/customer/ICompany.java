package framework.customer;

import java.util.Vector;

public interface ICompany extends ICustomer {
	public void addEmployee(IPerson employee);

	public Vector<IPerson> getEmployees();
}
