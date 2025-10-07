package in.sp.beans;

public class Student {
	private int roolno;
	private String name ;
	private String email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Email : " + email);
		System.out.println("RollNo : " + roolno);
	}

}
