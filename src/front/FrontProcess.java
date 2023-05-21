package front;

import java.util.Scanner;

import front.display.WalkerConsole;

public class FrontProcess{
	private final API api;
	
	public FrontProcess(API api) {
		this.api = api;
	}
	
	// TODO
	public void start() {
		// キーボードの入力ストリーム
		Scanner command = new Scanner(System.in);
		
		// API呼び出し　最初の盤面を生成
		
		while (true) {
			// API呼び出し 盤面を呼び出す
			int[][] response = this.api.findField();
			// 盤面を表示
			WalkerConsole console = new WalkerConsole(fieldToString(response));
			console.display();
			if(command.hasNext()) {
				if(command.next().equals("e")) {
					break;
				}
			}
		}
		
		command.close();
	}
	
	private String[][] fieldToString(int[][] field){
		String[][] result = new String[field.length][field[0].length];
		for(int yi=0; yi<field.length; yi++) {
			for(int xi=0; xi<field[0].length; xi++) {
				result[yi][xi] = fieldObjectToString(field[yi][xi]);
			}
		}
		return result;
	}
	
	private String fieldObjectToString(int e) {
		final int WALKER = 1;
		
		final String empty = " ";
		final String walker = "w";
		
		if(e == WALKER) { return walker; }
		
		return empty;
	}
}
