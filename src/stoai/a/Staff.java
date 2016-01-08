package stoai.a;

import java.util.Scanner;

public class Staff extends People{
	private String position;
	
	Scanner inp = new Scanner(System.in);
	
	public Staff(){
		super();
		this.position = "";
	}
	
	public Staff(String code, String name, String phone, String position){
		super(code, name, phone);
		this.position = position;
	}
	
	public void addStaff(){
		super.addPeople();
		System.out.println("Enter position:");
		this.setPosition(inp.nextLine());
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
}
