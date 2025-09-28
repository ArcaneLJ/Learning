
public class family {




	private int people;
	private String name;
	private int birthdate;
	
	family(int people, String name, int birthdate ){
		this.people = people;
		this.name = name;
		this.birthdate = birthdate;
	}
	
	
	//getter method
	public String  getname() {
		return name;
	}
	
	public int  getpeople() {
		return people;
	}
	
	
	public int  getbday() {
		return birthdate;
	}
	
	
	
	
	
	
	
	public void  setname(String name) {
		this.name = name;
	}
	

	public void  setpeople(int people) {
		this.name = name;
	}
	
	public void  setbday(int birthdate) {
		this.name = name;
	}
	
	
//copy method
		
		
public void copy(family x) {
	
	this.setname(x.getname());
	this.setpeople(x.getpeople());
	this.setbday(x.getbday());
}
	
	
	
	
	
	
	
	
	
	
}
