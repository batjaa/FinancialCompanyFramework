package framework.command;

import framework.account.Entry;
import framework.account.IAccount;

//
//
// Generated by StarUML(tm) Java Add-In
//
// @ Project : Financial Application Framework
// @ File Name : Desposit.java
// @ Date : 4/21/2014
// @ Author : Batjargal Batbold, Jose Ardaiz, Ripon Datta
//
//

public class Deposit extends AbstractCommand {
	private IAccount	account;
	private Entry		entry;

	public Deposit(IAccount account, Entry entry) {
		super("Deposit to account");
		this.account = account;
		this.entry = entry;
	}

	@Override
	public void execute() {
		if (account.getCustomer() == null) {
			setExecute(false);
			System.err.println("[Deposit PreExecution error] Account not bound to any customer");
		}
		if (execute) {
			if (!account.deposit(entry)) {
				System.err.println("[Deposit Execution error] Please check amount or account state");
				setExecute(false);
			}
		}
	}

}
