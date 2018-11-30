package terrainSimulator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Random;

public class Swamp extends TerrainSimulatorGame {

	public static int[][] Swamp;
	public static int maxSize = 0;
	
	public static void main(String[] args) {
	
		List<String> myList = Arrays.asList("you are stuck here forever");
		List<String> collect = myList.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect);
	
		maxSize = 30;
		Swamp = new int [maxSize][maxSize];
		
		
		//maxSize by maxSize - in this case 30x30//
		for (int a = 0 ; a <  maxSize ; a++){
		    for (int b = 0 ; b < maxSize ; b++) {
		    	int fillGrid = treasurePot(0,1);
	
		//at the moment its filling grid with random number, either 1 and 0//
		//I want it to enter just 1 single treasure pot//  	
		    	Swamp[a][b] = fillGrid;
		    	if (b == (maxSize - 1)) {
		    	System.out.println(Swamp[a][b]);		    	
		    	} else {
		    	System.out.print(Swamp[a][b] + " ");
		    	}
		    }	
		}    	
	}

	public static int treasurePot(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("max is less than min");
	}
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;	
	}
}



