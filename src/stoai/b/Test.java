package stoai.b;

import java.util.ArrayList;
import java.util.Scanner;

import stoai.a.Player;
import stoai.a.Staff;

public class Test {

	public static void main(String[] args) throws Exception{
		ArrayList<Player> arrListPlayer = new ArrayList<>();
		ArrayList<Staff> arrListStaff = new ArrayList<>();
		
		Manager manager = new Manager();
		manager.listPlayer = arrListPlayer;
		manager.listStaff = arrListStaff;
		
		int temp = 0;
		int select;
		
		while(temp == 0){
			System.out.println("\n1. Add player\n2. Add staff\n3. Delete player\n4. Delete staff\n5. Print list U23 player\n6. Print list all player\n7. Exit");
			System.out.println("Enter your select:");
			select = new Scanner(System.in).nextInt();
			
			switch(select){
				case 1: manager.addToList(1); break;
				case 2: manager.addToList(0); break;
				case 3:
					System.out.println("Enter player code to delete:");
					String codePlayer = new Scanner(System.in).nextLine();
					manager.delOutList(1,codePlayer);
					break;
				
				case 4:
					System.out.println("Enter staff code to delete:");
					String codeStaff = new Scanner(System.in).nextLine();
					manager.delOutList(0,codeStaff);
					break;
				case 5:
					manager.printListPlayerU23(); break;
				case 6:
					manager.printListPlayerAll(); break;
				case 7:
					System.err.println("Exited!");
					temp++;
				default:
					System.err.println("Selection incorrect, try again!(1 -> 7)");
					break;	
			}
			
		}

	}

}
