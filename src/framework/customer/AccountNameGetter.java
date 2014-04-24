package framework.customer;

import framework.account.IAccount;

public class AccountNameGetter extends FieldGetter<IAccount, String> {

	@Override
	public void process(IAccount account) {
		super.value = account.getName();
	}

}
