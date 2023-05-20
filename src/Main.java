import back.WalkerAPI;
import front.API;
import front.FrontProcess;

public class Main {
	public static void main(String[] args) {
		API api = new WalkerAPI();
		FrontProcess front = new FrontProcess(api);
		front.start();
	}
}
