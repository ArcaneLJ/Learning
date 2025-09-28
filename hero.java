
public class hero extends person {

	String power;
	String name;
	int age;
	
	
	hero(String name, int age, String power){
		super(name, age);
		
		this.power = power;
	}

//this    reffers to the class that you are in 
//super reffers to the parent class
	
	
	
	public String toString() {
		return super.toString()+this.power;
	}
}
