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
			users.get(counter).updateName(console.readWord());
			users.get(counter).updateUsername(console.readWord());
			users.get(counter).updateEmail(console.readWord());
			users.get(counter).updateAge(console.readInt());
			
			users.assignID(idCount);
			idCount++;
			counter++;
		}
		
	}
	
	public ArrayList<User> getList(){
		return users;
	}
}
