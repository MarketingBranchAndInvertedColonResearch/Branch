import java.util.Scanner;
import java.util.List*;

public class Database {
	
	private ArrayList<User> users = new ArrayList<User>();
	private EasyReader console;
	private int counter;
	private int idCount;
	
	public Database(){
		
		console = new EasyReader("clients.txt");
		counter = 0;
		idCount = 100000;
		while(!console.eof()){
			users.add(new User());
			users.get(counter).updateName(users.get(counter).prompt("Name"));
			users.get(counter).updateUsername(users.get(counter).prompt("Username"));
			users.get(counter).updateEmail(users.get(counter).prompt("Email Address"));
			users.get(counter).updateAge(users.get(counter).prompt("Age", true));
			
			users.assignID(idCount);
			idCount++;
			counter++;
		}
		
	}
	
	public ArrayList<User> getList(){
		return users;
	}
}
