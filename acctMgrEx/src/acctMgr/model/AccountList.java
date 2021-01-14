package acctMgr.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import accountManager.view.AccountManagerView;
import java.util.Map;
import java.util.concurrent.ExcutorService;
import java.util.concurrent.Executors;

import javax.swing.SwingUtilities;

import acctMgrEx.controller.AccountController;
import acctMgrEx.controller.AgentController;
import acctMgrEx.utils.CoresNumbers;
import acctMgrEx.view.AccountListView;
import acctMgrEx.view.AccountView;
import acctMgrEx.view.AccountViewSpring;
import acctMgrEx.view.AgentView;
import java.lang.Integer;

public class AccountList extends AbstractModel {
	
	/**
	 * Path to accounts file.
	 */
	private String accountFile;
	
	/**
	 * Dynamic list of accounts.
	 */
	
	private List<Account> accountList = new ArrayList<Account>();
	private Map<String, Account> accountMap = new HashMap<String, Account>();
	
	private Account currentAccount;
	
	//private ExecutorService fixedPool;
	
	/**
	 * Dynamic list of children.
	 */
	//public ArrayList<AccountController> children = new ArrayList<AccountController>();
	
	/**
	 * AccountMangerModel constructor
	 */
	public AccountList () { super(); }
	
	public AccountList(String filePath) throws Exception{
		accountFile = filePath;
		load(filePath);
		if(accountList.size() > 0) {
			currentAccount = accountList.get(0);
		}
		else {
			System.out.println("The account file is empty");
			System.exit(1);
		}
	}
	
	public void load(String filePath) throws Exception {
		int lineNumber = 0;
		try {
			BufferedReader inputFile = new BufferedReader(new FileReader("accounts.txt"));
			String temp = "";
			while ((temp = inputFile.readLine()) != null)
			{
				++lineNumber;
				System.out.println(temp);
				String [] tempArray = temp.split("\t");
				System.out.println(tempArray[0] + ";");
				System.out.println(tempArray[1] + ";");
				System.out.println(tempArray[2] + ";");
				Account account = new Account(tempArray[0], tempArray[1], new BigDecimal(tempArray[2]));
				
				accountList.add(account);
				accountMap.compute(tempArray[0], account);
			}
			inputFile.close();
		} catch (FileNotFoundException e) {
			throw new Exception("Invalid file: input file '" + filePath + "' not found");
		} catch (Exception e) {
			throw new Exception("Invalid file: error reading '" + filePath + "' at line " + lineNumber);
		}
	}
	public Account getAccount(String name) {
		return accountMap.get(name);
	}
	public Iterator<Account> accountsIterator(){
		return accountList.iterator();
	}
	/**
	 * Enumerates account list as an array of strings.
	 */
	public String [] listAccounts ()
	{
		String [] accounts = new String[accountList.size()];
		for (int i = 0; i < accountList.size(); ++i) { accounts[i] = accountList.get(i).getName(); }
		return accounts;
	}
	
	public void addAccount(Account account) {
		accountList.add(account);
		accountMap.put(account.getName(), account);
	}
	
	public void removeAccount(String name) {
		Account acc = accountMap.get(name);
		accountList.remove(acc);
		accountMap.remove(name);
	}
	
	//public void edit (int selected, String type)
	//{
		//currentAccount = accountList.get(selected);
		//if(currentAccount == null) System.out.println("currentAccount == null");
		//else {
			//System.out.println("account selected for " + currentAccount.getName());
			//final AccountController contr =
		//}
	}
}
