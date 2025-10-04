package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private int roolno;
	private String name;
	@Autowired
	private Address address;
	public int getRoolno() {
		return roolno;
	}
	public void setRoolno(int roolno) {
		this.roolno = roolno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
   public void display() {
	   System.out.println("RoolNo: " + roolno);
	   System.out.println("Name: " + name);
	   System.out.println("Addres" + address);
   }
}
