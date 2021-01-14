package acctMgr.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

@RunWith(Suite.class)
@SuiteClasses({
	AccountTest.class,
	AccountListTest.class })

class CombinedAccountTest {

}
