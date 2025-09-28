
public class Friends {

	
	String name;
	static int numberoffriends;
	
	Friends(String name){
		this.name = name;
		numberoffriends++;
	}
	//every time Friends method is called adds 1 to friend
	
	
	
	static void displayfriends() {
		System.out.println("you have "+numberoffriends+" friends!");
	}
	
}
