package back;

import java.util.Arrays;

import front.API;

public class WalkerAPI implements API {
	public int[][] findField(){
		int[][] resultField = new int[5][5];
		Arrays.stream(resultField).forEach(line -> Arrays.fill(line, 0));
		return resultField;
	}
	
	public int[][] findLatestField(){
		// TODO
		return null;
	}
	
	public boolean startNewGame() {
		// TODO
		return false;
	}
}
