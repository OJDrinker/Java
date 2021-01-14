package acctMgr.model;
import javax.swing.SwingUtilities;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class Account extends AbstractModel {
	private BigDecimal balance;
	private String name;
	private String ID;
	public Account(String name, String ID, BigDecimal balance) {
		this.name = name;
		this.ID = ID;
		this.balance = balance.setScale(2, RoundingMode.HALF_EVEN);
	}
	public BigDecimal getBalance() {return balance;}
	public String getName() {return name;}
	public String getID() {return ID;}
	public synchronized void deposit(BigDecimal amount) {
		balance = balance.add(amount);
		}
	public synchronized void withdraw(BigDecimal amount) {
		balance = balance.subtract(amount);
	}
		
		//final ModelEvent me = new ModelEvent(ModelEvent.EventKind.BalanceUpdate, balance, AgentStatus.NA);
		//notifyChanged(me)
		
/*		SwingUtilities.invokeLater(
				new Runnable() {
					public void run() {
						notifyChanged(me);
					}
				});
		notifyAll();
	}
*/	
	/*public synchronized void autoWithdraw(BigDecimal amount, IAgent ag) throws InterruptedException {
		while(balance.subtract(amount).signum() < 0) {
			ag.setStatus(AgentStatus.Blocked);
			//System.out.println("autoWithdraw blocking");
			wait();
		}
	} */
	//creating withdraw function
	
/*	public void withdraw(BigDecimal amount) {
		System.out.println("Old Balance: " + balance + " amount: " + amount);
		
		balance = balance.subtract(amnt);
		
		System.out.println("New balance: " + balance);
	}
	
	//creating deposit function
	
	public void deposit(int amount) {
		System.out.println("Old Balance: " + balance + " amount: " + amount);
		
		//converting data types
		
		BigDecimal amnt = new BigDecimal(amount);
		balance = balance.add(amnt);
		
		System.out.println("New balance: " + balance);
	}
*/	
	public Account() {
		balance = new BigDecimal(0.0);
		name = ""; ID = "";
	}
	
}
