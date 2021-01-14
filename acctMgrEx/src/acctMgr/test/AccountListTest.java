package acctMgr.test;

import acctMgr.model.Account;
import acctMgr.model.OverdrawException;

import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.util.Iterator;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

class AccountListTest {

	@After
	public void tearDown() throws Exception {
	}
	
	
	@Test
	void testLoad() {
		Iterator<Account> iter = list.accountsIterator();
		if(iter.hasNext()) {
			Account account = iter.next();
			String name = account.getName();
			String ID = account.getID();
			BigDecimal balance = account.getBalance();
			System.out.println(name + " " + ID + " " + balance.toString());
			assertEquals(name, "Jake");
			assertEquals(ID, "432");
			assertEquals(balance.toString(), "10177.90");
		}
		else {
			fail("NO accounts read");
		}
	}

}
