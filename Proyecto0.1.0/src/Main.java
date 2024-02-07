import Classes.Config;
import Classes.Input;
import Classes.Session;
            
public class Main {
	public static Session currentSession = new Session();
	
	public static void main(String[] args) {
		System.out.println(Config.VERSION);
		
		System.out.println(Config.WELCOME);
		int option = -1;
		do {
			if(currentSession.isLogged()) {
				option = Input.getInt(Config.LOGGED_MENU);
				loggedAction(option);
			} else {
		 option = Input.getInt(Config.UNLOGGED_MENU);
		 unloggedAction(option);
		
			}
		}while(option != 0);
	
		
		System.out.println(Config.GOODBYE);

	}
	public static void unloggedAction(int option) {
		if(option == 1) {
			currentSession.login();
		} else if (option == 2) {
			currentSession.signup();
		}
	}
	public static void loggedAction(int option) {
		if(option == 1) {
			System.out.println("Proximamente");
		}else if(option == 2) {
			System.out.println("Proximamente");
		}else if(option == 3) {
			System.out.println("Proximamente");
		}else if(option == 4) {
			System.out.println("Proximamente");
		}else if (option == 5) {
			currentSession.showUser();
		}
	}
}