package framework.report;

import framework.account.IAccount;

public abstract class AbstractAccountBill extends AbstractBillFunctor<IAccount> {

	@Override
	public void process(IAccount account) {
		writeInReport(account);
	}

}
