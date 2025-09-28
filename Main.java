import java.util.Scanner;
import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.Random;

public class Learning {

	public static void main(String[] args) {
	
		
		// print
		
		System.out.println("HI");
		System.out.print("What is your name?");
		
		// \n will print down a line
		// \t will act as if you pressed tab
		// to print something on 1 line do  System.out.print
		// to skip a line do  System.out.println
		//to display a quotation mark do \"
		//to display a backslash do 2 backslashes
		
		
		
		
		//variable
		
	int numbersforfun = 12310;
	//int holds values from -2billion to 2 billion
	//long holds values from -9 quintillion to 9 quintillion
	//byte holds values from -128 to 127
	//short holds values from -32768 to 32767
	boolean TorF = true;
	// boolean holds true or false
	double fractions = 2.1029304;
	String words = ("what is life");
	char abc = ('A');
	
	System.out.println("\n\nmy number is: "+numbersforfun);	
	System.out.println("do you have the awnser to: "+words +"?");	
		
	//Long varible numbers need to end in a capital L	
	//float varible numbers need to end in a lowercase f	
	//you can switch varibles or add them	
		
	
	
	
	//user input
	
	
	//making a scanner
	Scanner scanner = new Scanner(System.in);
	//you can always close a scanner using scanner.close();
	//scanner.next(); makes it so if either space or enter is pressed scanner ends
	System.out.println("What is your name?");
	String yourname = scanner.nextLine();
	System.out.println("How old are you?");
	int age = scanner.nextInt();
	scanner.nextLine(); //to clear the scanner
	System.out.println("what do you want to say");
	String yourmo = scanner.nextLine();
	System.out.println("hello "+yourname+" you are "+age+" years old "+yourmo);
	
	
	
	//expressions 
	//they are pretty much operaters
	//% gives you the remainder of any division
	//some include + - / *
	
	int people = 10;
	
	people = people * 2;
	people++; // adds 1 to people
	people--; //subtracts 1 from people
	
	System.out.println("\n\n" +people);
	
	
	
	//GUI / Graphical user interface
	
	String favvideogame = JOptionPane.showInputDialog("What is your favourite video game?");
	JOptionPane.showMessageDialog(null,"your fav video game is "+favvideogame);
	
	int pillowpattern = Integer.parseInt(JOptionPane.showInputDialog("What is your favourite pillow pattern?(use numbers)"));
	//	Integer.parseInt was used to convert to integer
	
	JOptionPane.showMessageDialog(null," your favourite pillow pattern is "+pillowpattern);
	
	double height = Double.parseDouble(JOptionPane.showInputDialog("What is your height?(use numbers)"));
	//	Double.parseDouble was used to convert to double
	
	JOptionPane.showMessageDialog(null," your height is "+height);

	
	
	//the math class
	
	double x = 3.14;
	double y = -10;
	
	double z = Math.max(y, x);
	// Math.max(y, x); compares which number is bigger
	// Math.min(y, x); compares which number is smaller
	// Math.abs(y); is the absoulute value of y (the number without the negitive)
	// Math.sqrt(y); does the square root of y
	// Math.round(x); rounds x
	// Math.ceil(x); rounds x up
	// Math.floor(x); rounds x down
	
	System.out.println(z);
	
	
	//Random numbers
	
	Random random = new Random();
	
	int gamertag = random.nextInt(10)+1;
	//(10)+1 gives random number between 1 and 10
	//double gamertag = random.nextDouble(); generates a number between 0 and 1
	//boolean gamertag = random.nextBoolean(); generates true or false
	
	System.out.println(gamertag);
	
	
	
	
	
	//if statements
	
//if an if statement is true it will do a block of code	
	
	int volume = 10;
	
	if(volume<=20){
	
	System.out.println("\n\n good volume");
	}
	else if (volume<=90) {
		System.out.println("\n\n great volume");
	}
	else {
		System.out.println("\n\n bad volume");
	}
//to compare if something is equal use 2 equal signs

	
	
	
	//switches
	
	//a switch is a statement that allows a variable to be tested for equality against a list of values
	
String day = "Wendsday";	
	
switch(day)	{

case "Sunday":System.out.println("It is Sunday");
//can add more code here
break;
case "Monday":System.out.println("It is Monday");
break;
case "Tuesday":System.out.println("It is Tuesday");
break;
case "Wendsday":System.out.println("It is Wendsday");
break;
case "Thursday":System.out.println("It is Thursday");
break;
case "Friday":System.out.println("It is Friday");
break;
case "Saturday":System.out.println("It is Saturday");
break;
default: System.out.println(day+" is not a day");
//default: is pretty much the else statement
}
	
	
	
	
	
	
	
//logical operators	
	
//&& = (AND) both conditions must be true
// || (OR) either condition must be true
// ! (NOT) reverses boolean value of condition


int temp = 25;

if (temp>30) {
	System.out.println("it is hot");
}
else if (temp>=20 && temp<=30) {
	System.out.println("good temp");
}
else {
	System.out.println("it is cold outside");
}
	
	
Scanner jeb = new Scanner(System.in); 	
	
System.out.println("Press q or Q to quit game");

String response = jeb.next();	
	
	if (!response.equals("q") && !response.equals("Q")) {
		System.out.println("pew");
		
	}
	else {	
		System.out.println("Quitter! :(");
	}
	
	
	
	
	
	
	//while loop	
	
//executs a block of code as long as it remains true	
	
	
	Scanner kyle = new Scanner(System.in);
	
	
	String life = "";
	
	while(life.isBlank()) {
		System.out.println("What is life?");
		life = kyle.nextLine();
	}
	System.out.println("THX...bye");
	

	
	//for loops 
	
//A for loop executes a block of code a limited amount of times	
	
	
	for(int i = 10; i>=0;) {
	System.out.println(i);	
	i-=2;//changes i by -2
	}
	System.out.println("Happy New Year!!!");
	
	
	
	
//nested loops
	
	//a loop inside of a loop
	
	Scanner joe = new Scanner(System.in);
	int rows;
	int columns;
	String symbol = "";
	
	System.out.println("Enter # of rows: ");
	rows = scanner.nextInt();
	System.out.println("Enter # of columns: ");
	columns = scanner.nextInt();
	System.out.println("Enter symbol: ");
	symbol = scanner.next();
	
	for(int c=1; c<=rows; c++) {
		System.out.println();
		for(int j=1; j<=columns; j++) {
			System.out.print(symbol);
		}
	}
	
	
	
	
	
	//array
	
	
	//an array is used to store multiple values in a variable
	//can also have arrays of integers
	
	
	// way 1
	
	String[] cars = {"ford","tesla", "truck" };
	//computers always start at 0 so to access number 1 you do 0
	cars[0]= "Mustang";
	System.out.println();
	System.out.println();
	System.out.println();
	
	
	
	//way 2
	
	//String[] cars = new String[3];
	//the 3 was the number of values that can be held in the array
	
	//cars[0] = "ford";
	//cars[1] = "tesla";
	//cars[2] = "truck";
	
	
	//for some reason this does'nt work
	int h;
	for(h=0; h<=cars.length; h++ ) {
	System.out.println(cars[h]);
		}
	
	
	
	
	
	
	
	//2d array
	//an array of arrays
	
	//see at 1:45:50
	
	// making array
	String[][] car = new String[3][3];//[3][3] means 3x3
	
	
	car[0][0] = "camaro";
	car[0][1] = "corvette";
	car[0][2] = "ford";
	car[1][0] = "tesla";
	car[1][1] = "ranger";
	car[1][2] = "F-150";
	car[2][0] = "bugatti";
	car[2][1] = "Lambo";
	car[2][2] = "Limo";				
	
	
	for(int o=0; o<car.length; o++) {
		System.out.println();
		for(int b=0; b<car[o].length; b++) {
			System.out.println(car[o][b]);
		}
	}
	
	
	
	
	//string methods
	
	String bro = "nona";
	
	boolean result = bro.equalsIgnoreCase("nono");
	// above gives a true or false if string bro is true
	//Ignore case means ignore uppercase or lowercase
	
	System.out.println(result);
	
			
	
	int results = bro.length();
	System.out.println(results);
	
	//this shows the length of bro
	
	
	char resault = bro.charAt(1);
	//finds the declared value
	
	int resualt = bro.indexOf("o");
	//finds what place the o is in
	
	boolean resaults = bro.isEmpty();
	//finds if bro is empty
	
	String resualtss = bro.toUpperCase();
	//sets all to uppercase
	
	//String resualtss = bro.toLowerCase();
	//sets all to lowercase
	
	String reausalts = bro.trim();
	//trims all spaces
	
	String resuallts = bro.replace("b", "o");
	//b is new o is old
	
	
	
	// wrapper classes
	
	// if big code use primitve when can
	
	//provides a way to use primitive data types as refrence type
	
	// autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper class 
	//unboxing = the reverse of autoboxing
	
	
	// we autoboxing now
	
	Boolean a = true;
	// see uppercase
	
	Character b = '@';
	
	Integer c = 43;
	
	Double d = 20.123;
	
	String e = "bro";
	
	

	
	
	//Array lists
	
	//an resizable array
	//elements can be add and removed after made 
	//only store refrence data types
	//can us wrapper class
	
	
	// making list
	ArrayList<String> food = new ArrayList<String>();
	//can also be used with ints
	
	
	//add function
	
	food.add("pizza");
	food.add("apple");
	food.add("ham");
	
	//useful methods
	
	food.set(1, "dog");
	//above sets the 1st value to dog instead of apple
	
	food.remove(2);
	//above removes ham from the list
	
	//food.clear();
	//clears array
	


	//with array lists use .size instead of .length
	for(int q=0; q<food.size(); q++) {
		System.out.println(food.get(q));
	}
	//above for loop displays all items
	
	
	
	//2d array lists
	//a dynamic list of lists
	//You can change the size of these lists during runtime
	
	
	//2d array list
	
	ArrayList<ArrayList<String>> grocreyList = new ArrayList();
	
	
	
	
	
	
	//creating array list#1
	ArrayList<String> bakreyList = new ArrayList();
	
	bakreyList.add("croissants");
	bakreyList.add("cake");
	bakreyList.add("cupcake");
	

	
	//creating array list#2
	ArrayList<String> produceList = new ArrayList();
	
	produceList.add("carrot");
	produceList.add("celery");
	produceList.add("apple");
	
	//creating array list#3
		ArrayList<String> drinksList = new ArrayList();
		
		drinksList.add("pop");
		drinksList.add("water");
		drinksList.add("juice");
	//lists don't need to be the same size as one another
	
	
	//adding lists to grocery list
	grocreyList.add(bakreyList);
	grocreyList.add(produceList);	
	grocreyList.add(drinksList);		
		
	
	//System.out.println(bakreyList.get(0));
	//the 0 was to get a croissant
	
	System.out.println(grocreyList);
	//this prints the whole list
	
	System.out.println(grocreyList.get(0));
	//this gets the first list
	
	System.out.println(grocreyList.get(0).get(0));
	//this gets the first item of the first list
	
	
	
	
	
	//for each loop
	
	//traversing technique to iterate through the elements in an array/collection
	//less steps more readable
	//less flexible 
	
	
	//below for array
	String[]books = {"chirp","chickadee","owl", "harry potter"};
	
	for(String p  :  books) {
		System.out.println(p);
	}
	
	
	
	//below arraylist
	
	ArrayList <String> animals = new ArrayList();
	
	animals.add("bird");
	animals.add("cat");
	animals.add("dolphin");
	animals.add("dog");
	
	for(String k  :  animals) {
		System.out.println(k);
	}
	
	
	
	//methods
	//a block of code that is executed whenever it is called upon
	//see bottom
	
	String noah = "noah";
	int ages = 21;
	//you can pass variables through methods
	hello(noah, ages);
	
	
	
	//returning values
	
	int l = 3;
	int t = 4;
	
	int j = add(l, t);
	
	System.out.println(j);
	
	
	
	
	
	
	
	//overloaded methods
	//methods that share the same name but have different parameters
	//method name + parameters = method signature
	//more parameters
	//you do not need variables you can straight up use integers
	
	//#1
	int aa = 5;
	int bb = 3;
	
	int cc = barry(aa, bb);
	
	System.out.println("this is method #1");
	System.out.println(cc);
	
	
	
	//#2
	
	int dd = 34;

	
	int ff = barry(aa, bb, dd);
	
	
	System.out.println("this is method #2");
	System.out.println(ff);
	
	//#3
	
	int ee = 2;
	
	double gg = barry(aa, bb, dd, ee);
	
	System.out.println("this is method #3");
	System.out.println(gg);
	
	
	
	
	
	//printf
	//an optional method to control, format, and display text to the console window
	//two arguments = format string + (object/variable/value)
	//% [flags] [precision] [width] [conversion-character]
	
	
	//note printf
	//the %d shows where the 123 will go
	//Conversion character is a letter that appears after%
	//%d is for intagers 
	//%b is for boolean
	//%c is for char's
	//%s is for string
	//%f is for double
	System.out.printf("This %d is a format string ", 123);
	
	boolean myBoolean = true;
	char myChar = '@';
	String myString = "noah";
	int myInt= 1432;
	double myDouble = 234.123;
	
	//System.out.printf("%b", myBoolean);
	//System.out.printf("%c", myChar);
	//System.out.printf("%s", myString);
	//System.out.printf("%d", myInt);
	//System.out.printf("%f", myDouble);
	
	
	
	//width
	//the amount of spaces before your number
	
	System.out.printf("Hello%12s", myString);
	
	
	//Precision
	//The amount of decimal places
	
	System.out.printf("money =%.2f", myDouble);
	
	
	//flags
	//adds an effect to outpost based on the flag added to format specifer
	// - :left justify
	// + :show if the number is + or -
	// 0 :numeric values are zero padded
	// , :comma grouping seperator if numbers > 1000
	
	
	
	
	
	// final keyword
	// anything declared as final cannot be changed or updated
	
	
	final double PI = 3.14159;
	

	
	System.out.println(PI);
	
	
	
	
	
	//OOP (Object oriented programming)
	
	//object = an instance of a class that may contain attributes and methods
	//examples: phone, desk, computer, coffee cup
	//oop class
	
	oop myCar = new oop();
	
	System.out.println(myCar.color);
	System.out.println(myCar.make);
	System.out.println(myCar.model);
	System.out.println(myCar.price);
	
	myCar.drive();
	myCar.stop();
	
	

	
	
	
	//Constructors
	//a special method that is called when an object is instantiated (created)
	//human class
	
    Human human1 = new Human("Noah", 12, 70.2);
    Human human2 = new Human("Jen", 50, 117);
    Human human3 = new Human("Mike", 43, 168.4);
	
	human2.eat();
	human1.eat();
	human3.eat();
	
	human2.drink();
	human1.eat();
	human3.drink();
	
	
	
	//variable scope
	
	// local declared inside a method
	//visible only to that method
	
	//global outside a method, but within a class
	//visible to all parts of class
	
	//dice idea
	
	
	dice diceRoller = new dice();
	
	
	
	
	
	
	//overloaded constructers
	//multiple constructers within a class with the same name
	//have diffrent peramaters
	//name+paramaters=signature
	//Pizza class
	
Pizza pizza = new Pizza("chedder", "thicc", "tomato", "pineapple");

	System.out.println("here are your ingredients for the pizza:\n");
	System.out.println(pizza.bread);
	System.out.println(pizza.cheese);
	System.out.println(pizza.sauce);
	System.out.println(pizza.topping);
	
	//toString method
	//special method that all objects inheret 
	//returns a string that textually represents an object
	//can be used both implicitily and explicitly
	
	
	
	oop carss = new oop();
	
	System.out.println(carss);
	//this prints out the address of the car
	
	//calling explictly
//System.out.println(carss.toString());	
	
	
	//works the same because toString is bound to carss
	System.out.println(carss);
	
	
	
	
	//an array of objects
	
	
	Food[]foods = new Food[3];
	// the 3 means 3 objects in the array
	//Food[] means that you are making an array
	
	
	Food food1 = new Food("hotdog");
	Food food2 = new Food("pizza");
	Food food3 = new Food("hamburger");
	
	
	foods[0] = food1;
	foods[1] = food2;
	foods[2] = food3;
	
	System.out.println(foods [0]);
	//prints 1st thing in foods
	
	//System.out.println(foods);
	//prints all of foods no work
	
	
	
	
	
	//object passing
	
	
	
	Garage garage = new Garage();
	
	//oop carsss = new oop("chevyyy");
	//oop carsss2 = new oop("tesla");
	
	
	
	
	
	//garage.park(carsss);
	//garage.park(carsss2);
	
	
	//static keyword
	//a modifier. A single copy of a variable/ method is created and shared. 
	// The class owns the static member
	//??not great at this
	
	Friends friend1 = new Friends("Bob");
	Friends friend2 = new Friends("Jerry");
	Friends friend3 = new Friends("Ben");
	
	System.out.println(Friends.numberoffriends);
	//since variable is static just type in variable
	//to use declare class
	//don't have put it in your constructers
	
	Friends.displayfriends();
	// to call declare class
	
	
	
	
	//inheritance
	//Gives methods and variables to other classes
	//do at the top class extends class
	
	
	car carrs = new car();
	carrs.go();
	System.out.println(carrs.wheels);
	
	bike bike = new bike();
	bike.go();
	System.out.println(bike.pedals);
	
	
	Vheicle vheicle = new Vheicle();
	vheicle.go();
	
	System.out.println(carrs.speed);
	
	
	
	
	//method overriding
	//declaring a method in a subclass which is already present in a parent class
	//done so that a child class can give its own implementation
	
	
	
	dog dog = new dog();
	
	dog.speak();
	//dog uses its overriding method whereas the animal uses its method
	//if overriding method is deleted then uses closest speak method to it
	
	
	Animal animal = new Animal();
	animal.speak();
	
	
	
	
	//super keyword
	//reffers to the superclass (parent) of an object
	//very similer to the this keyword
	//WORK ON THISSSSSS
	
	
	hero hero1 = new hero("hiro", 34, "flying");
	
	System.out.println(hero1.name);
	System.out.println(hero1.age);
	System.out.println(hero1.power);
	
	
	hero hero2 = new hero("noah", 12, "invisibility");
	System.out.println(hero2.name);
	System.out.println(hero2.age);
	System.out.println(hero2.power);
	
	
	System.out.println(hero2.toString());
	
	
	
	//abstract keyword
	//adds a layer of security to program
	
	//abstract = abstract classes can't be instantiated but can have a subclass
	//abstract methods are declared without an implementation
	
	
	
	//cannot make an object if class is abstract
	
	
	//methods can't be used in abstract parent class. instead use child class
	
	
	
	
	
	//access modifiers
	
	//none means that anything in the same package can reference but nothing out of package can reference
	
	//public can be seen as long as classes are in same source
	 
	//protected can be seen in any class in a source folder as long as there is a subclass of the class that has the protected variable
	
	//private can only be seen in the class that it was made in
	
	
	
	
	//Encapsulation 
	
	//Attributes of a class will be hidden on private
	// can be accessed only through methods
	//you should only make attributes private if you don't have a reason to make them public/protected
	
	
	sports sports = new sports ("soccer", "soccerball", 1100);
	
	//System.out.println(sports.sport);
	//make not visible because it is private
	
	//instead
	System.out.println(sports.getSport());
	//this only works because I made a method that returned the sport variable
	
	
	sports.setSport("basketball");
	//this only works because I made a method in the sport class
	
	
	
	
	//copy objects
	
	

	
	
	
	family member1 = new family(4, "jeb", 2010);
	family member2 = new family(3, "noah", 2011);
	
	
	
	//copy method in family class
	member2.copy(member1);
	
	//makes member2 member1 but still different addresses 
	
	
	
	
	
	//interface
	
	//a template that can be applied to a class
	//Similar to inheritance, but specifies what a class has/must do	
	//classes can apply more than 1 interface, inheritance is limited to 1 super
	
	rabbit rabbit = new rabbit();
	
	rabbit.flee();
	
	hawk hawk = new hawk();
	
	hawk.hunt();
	
	fish fish = new fish();
	
	fish.hunt();
	fish.flee();
	
	
	
	
	//polymorphisim
	//greek word for poly-"many", morph-"form"
	//the ability to identify as more than one type
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	
	//method
	
	static void hello(String noah, int ages) {
		System.out.println("helloooooo "+noah);
		System.out.println("you are "+ages);
	}
	
	//return
	//int is because you are returning an int
	//add is the method name
	static int add(int l, int t) {
		int j = l + t;
		return j;
		
	}
	
	
	
	
	//overloaded methods
	//this adds 2 numbers and then reports them back
	static int barry(int aa, int bb) {
		return aa + bb;
		
		
	}
	
	
	static int barry(int aa, int bb, int dd) {
		return aa + bb + dd;
		
		
	}
	
	static double  barry(double aa, double  bb, double  dd, double  ee) {
		return aa + dd / bb * ee;
	}
	
 
	
	
	
	
	
	
	
	
}
