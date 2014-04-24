package framework.report;

import framework.account.IAccount;

public class BaseAccountBill extends AbstractAccountBill {

	@Override
	public void writeInReport(IAccount account) {
		addLine("Account Nr: " + account.getName());
		addLine("Balance: $ " + account.getBalance());
	}

}
