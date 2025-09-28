
public class Human {

	
	String name;
	int age;
	double weight;
	
	
	
	
	
	Human(String name, int age, double weight){
		
		//pretend .this is human
		this.name = name;
		this.age = age;
		this.weight = weight;
		
		
		
		
		
		
	}
		
	
	void eat() {
		System.out.println(this.name +"is eating");
	}
	
	
	void drink() {
		System.out.println(this.name +"is drinking");
	}
	
	
	
}
