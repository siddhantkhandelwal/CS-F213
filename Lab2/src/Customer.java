
public class Customer {
	private String name;
	private String idNo;
	private double balance;
	private Item item;
	
	Customer(String name, String idNo, double balance){
		this.name = name;
		this.idNo = idNo;
		this.balance = balance;
	}
	
	Customer(String name, String idNo){
		this.name = name;
		this.idNo = idNo;
		this.balance = 5000.0;
	}
	
	public String getName(){
		return this.name;
	}
	public String getidNo(){
		return this.idNo;
	}
	public double getBalance(){
		return this.balance;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setidNo(String idNo){
		this.idNo = idNo;
	}
	
	public void printItemAndBalance(){
		System.out.println("Item Name: " + this.item.getitemName());
		System.out.println("Item IDNo: " + this.item.getitemidNo());
		System.out.println("Item Quantity: " + this.item.getitemQuantity());
		System.out.println("Item Price: " + this.item.getitemPrice());
		this.balance = this.balance - this.item.getitemPrice();
		System.out.println("Balance (After Purchase): " + this.balance);
	}
}
