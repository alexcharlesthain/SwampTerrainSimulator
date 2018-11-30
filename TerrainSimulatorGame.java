package terrainSimulator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TerrainSimulatorGame {

	static int Archibold = 1;
	static int Wendy = 2;
	
	public static void main(String[] args) {

		List<String> myList = Arrays.asList("Welcome to the swamp of doom!");
		List<String> collect = myList.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect);
		
		System.out.println("Play Game");
		
		System.out.println("Select 1 or 2, for Archibold or Wendy");
		
		Scanner personChoice = new Scanner(System.in);
		int a = personChoice.nextInt();
		playgame();
	}	
		
		public static String playgame() {
			int personChoice = 0;
			
			if(personChoice == Archibold) {
				return "You have chosen Archibold the Assasin";
			}	
			if(personChoice == Wendy) {	
				return "You have chosen Wendy the Weapon";
			}			
				
		System.out.println("Your perilous journey has led you the murkiest swamp in the history of merky swamps. You look around but cannot see anything to hint at your location. You must try to escape.");
		
		System.out.println("You can hear an eery cry in the distance, what could it be? Is it the deadly 2-Headed Llama you have heard about in the tales. You must find something to fend it off with");
		
		System.out.println("You must try to search North, South, West and East for possible clues or useful tools using the compass you luckily brought with you");
		
		return "you have chosen Archibold the Assasin";
		

	}
	//public static String playgame() {
		//return "Choose direction to search";
		
		
	}


