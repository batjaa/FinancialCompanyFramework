package framework.report;

import framework.customer.ICustomer;

public class BaseCustomerBill extends AbstractCustomerBill {

	public BaseCustomerBill(AbstractAccountBill abf) {
		super(abf);
	}

	@Override
	public void writeInReport(ICustomer customer) {
		addLine("Name: "+customer.getName());
	}

}
