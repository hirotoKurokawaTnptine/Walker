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
		
		// API呼び出し 盤面を呼び出す
		int[][] response = this.api.findField();
		
		while (true) {
			// 盤面を表示
			WalkerConsole console = new WalkerConsole(response);
			console.display();
			if(command.hasNext()) {
				if(command.next().equals("e")) {
					break;
				}
			}
		}
		
		command.close();
	}
	
	// TODO
	public void stop() {
		
	}
}
