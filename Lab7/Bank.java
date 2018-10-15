import java.util.*;

public class Bank {
	private ArrayList<Account> accts;
	int maxActive;
	
	Bank(){
		accts = new ArrayList<Account>();
		maxActive = 0;
	}
	
	public boolean addAccount(Account newone) {
		if(accts.add(newone)){
			return true;
		}
		return false;
	}
	
	public boolean removeAccount(long acctnum) {
		ListIterator<Account> litr = accts.listIterator();
		while(litr.hasNext()){
			Account element = (Account)litr.next();
			if(element.getaccNumber() == acctnum) {
				accts.remove(element);
				return true;
			}
		}
		return false;
	}
	
	public double deposit(long acctnum, double amount) {
		ListIterator<Account> litr = accts.listIterator();
		while(litr.hasNext()) {
			Account element = (Account)litr.next();
			if(element.getaccNumber() == acctnum){
				element.setbalance(element.getbalance() + amount);
				litr.set(element);
				return element.getbalance();
			}
		}
		return -1;
	}
	
	public double withdraw(long acctnum, double amount) {
		ListIterator<Account> litr = accts.listIterator();
		while(litr.hasNext()) {
			Account element = (Account)litr.next();
			if(element.getaccNumber() == acctnum){
				if(element.getbalance() - amount >= 0){
					element.setbalance(element.getbalance() - amount);
					litr.set(element);
					return element.getbalance();
				}
				else{
					return -1;
				}
			}
		}
		return -1;
	}
	
	public String toString() {
		ListIterator<Account> litr = accts.listIterator();
		String accAll = new String();
		while(litr.hasNext()) {
			Account element = (Account)litr.next();
			accAll += element;
		}
		return accAll;
	}
	
}
