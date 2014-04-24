package framework.report;

import framework.account.IAccount;
import framework.customer.ICustomer;

public abstract class AbstractCustomerBill extends AbstractBillFunctor<ICustomer> {

	private AbstractAccountBill	abf;

	public AbstractCustomerBill(AbstractAccountBill abf) {
		this.abf = abf;
	}

	@Override
	public void process(ICustomer customer) {
		writeInReport(customer);
		for (IAccount account : customer.getAccounts()) {
			abf.process(account);
		}
		addLine(abf.getReport());
		addEmptyLine();
		abf.clear();
	}

}
