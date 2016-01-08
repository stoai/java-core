package stoai.a;

import java.util.Calendar;
import java.util.Scanner;

public class Player extends People{
	private int birthYear;
	
	Scanner inp = new Scanner(System.in);
	
	public Player(){
		super();
		this.birthYear = 0;
	}

	public Player(String code, String name, String phone, int birthYear){
		super(code, name, phone);
		this.birthYear = birthYear;
	}
	
	public void addPlayer(){
		super.addPeople();
		System.out.println("Enter birth year:");
		this.setBirthYear(inp.nextInt());
		System.err.println("Successfully added player!\n");
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public String printPlayer(){
			Calendar cal = Calendar.getInstance();
			int age = cal.get(Calendar.YEAR)-this.birthYear;
		
			return "\t"+this.getCode()+"\t\t"+this.getName()+"\t\t"+this.getPhone()+"\t\t"+this.getBirthYear()+"( "+age+" years old )";	 
	}
	
	@Override
	public String toString(){
		return "==================================================================\n"
				+ "Player code\t"+"Player name\t\t"+"Player phone\t\t"+"Birth year\n"
				+"\t"+this.getCode()+"\t"+this.getName()+"\t"+this.getPhone()+"\t"+this.getBirthYear();
	}
	

}
