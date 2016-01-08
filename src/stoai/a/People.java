package stoai.a;

import java.util.Scanner;

public class People {
	private String code;
	private String name;
	private String phone;
	
	Scanner inp = new Scanner(System.in);
	
	public People(){
		this.code = "";
		this.name = "";
		this.phone = "";
	}
	
	public People(String code, String name, String phone){
		this.code = code;
		this.name = name;
		this.phone = phone;
	}
	
	public void addPeople(){
		System.out.println("Enter code:");
		this.setCode(inp.nextLine());
		System.out.println("Enter name:");
		this.setName(inp.nextLine());
		System.out.println("Enter phone:");
		this.setPhone(inp.nextLine());
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
