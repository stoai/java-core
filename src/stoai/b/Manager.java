package stoai.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import stoai.a.Player;
import stoai.a.Staff;

public class Manager implements Task{
	public ArrayList<Player> listPlayer;
	public ArrayList<Staff> listStaff;
	
	public void swap(){
		Collections.sort(listPlayer, new Comparator<Player>() {
			@Override
			public int compare(Player o1, Player o2) {
				 if (o1.getBirthYear() < o2.getBirthYear()) {
	                    return -1;
	                } else {
	                    if (o1.getBirthYear() == o2.getBirthYear()) {
	                        return 0;
	                    } else {
	                        return 1;
	                    }
	                }
			}
		});
	}
	//
	public void addToList(int flag){
		if(flag == 1){
			Player player = new Player();
			player.addPlayer();
			listPlayer.add(player);
			
		}else{
			Staff staff = new Staff();
			staff.addStaff();
			listStaff.add(staff);
			
		}
	}
	//
	public void delOutList(int flag, String codeToDel){
		
			if(flag == 1){
				if(listPlayer.isEmpty()){
					System.err.println("List player empty!");
				}
				for(Player p : listPlayer){
					if(p.getCode().equals(codeToDel)){
						listPlayer.remove(p);
						System.err.println("Successfully deleted player!");
						break;
					}
				 }
			}else{
				if(listStaff.isEmpty()){
					System.err.println("List staff empty!");
				}
				for(Staff s : listStaff){
					if(s.getCode().equals(codeToDel)){
						listStaff.remove(s);
						System.err.println("Successfully deleted staff!");
						break;
					}
			}
		}				
	}
	//
	public void printListPlayerU23(){
		System.out.println("======================================**U23**==========================================\n");
		System.out.println("Player code\t\t"+"Player name\t\t"+"Player phone\t\t"+"Birth year");
		for(Player p : listPlayer){//from 1993 to 2000
			if(p.getBirthYear() >= 1993 && p.getBirthYear() <= 2000){
				System.out.println(p.printPlayer());
			}
			
		}
		System.out.println("\n=======================================================================================");
	}
	//
	public void printListPlayerAll(){
		System.out.println("==================================================================================\n");
		System.out.println("Player code\t\t"+"Player name\t\t"+"Player phone\t\t"+"Birth year");
		swap();
		for(Player p : listPlayer){			
			System.out.println(p.printPlayer());
		}
		System.out.println("\n==================================================================================");
	}
}
