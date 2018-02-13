
import java.io.Console;

public class ConsoleDemo {

	public static void main(String[] args) {

		Console console=System.console();
		
		String name=console.readLine("Enter Name:");
		char pas[]=console.readPassword("Enter Password");
		
		System.out.println("Name is :" +name);
		System.out.println("Password is :"+pas);
	}
}
