package framework.account;

import java.util.Vector;

import framework.customer.ICustomer;

//
//
// Generated by StarUML(tm) Java Add-In
//
// @ Project : Financial Application Framework
// @ File Name : IAccount.java
// @ Date : 4/21/2014
// @ Author : Batjargal Batbold, Jose Ardaiz, Ripon Datta
//
//

public interface IAccount {
	public String getName();

	/**
	 * Adds entry to the account.
	 * @param entry
	 */
	public void addEntry(IEntry entry);

	/**
	 * Will deposit money to the account.
	 * @param entry Entry for account
	 * @return If success true. Depending on account state command may not succeed
	 */
	public boolean deposit(Entry entry);

	/**
	 * Will withdraw money from account.
	 * @param entry Entry for account
	 * @return If success true. Depending on account state command may not succeed
	 */
	public boolean withdraw(Entry entry);

	/**
	 * Get entries.
	 * @return
	 */
	public Vector<IEntry> getEntries();

	/**
	 * Get balance amount. A pre-calculated value will return.
	 * @return
	 */
	public double getBalance();

	/**
	 * Set customer of the account.
	 * @param customer
	 */
	public void setCustomer(ICustomer customer);

	/**
	 * Get customer.
	 * @return
	 */
	public ICustomer getCustomer();

	/**
	 * Will close the account.
	 */
	public void closeAccount();

	/**
	 * Changes the state of the account to Active
	 */
	public void activateAccount();

	public void broadcastChange();
}