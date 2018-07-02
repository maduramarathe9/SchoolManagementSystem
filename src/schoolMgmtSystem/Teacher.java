package schoolMgmtSystem;

public class Teacher {
	
	/*
	 * This class is for the Teacher object
	 * It will have attributes such as id, name, salary
	 * 
	 */
	
	private int id;
	private String name;
	private int Salary;
	
	/*
	 * Create a constructor for the Teacher class
	 */
	
	public Teacher(int id, String name, int salary){
		this.id = id;
		this.name = name;
		this.Salary = salary;	
	}
	
	/*
	 * Write setters and getters for the class
	 * 
	 */
	public void setSalary(int salary){
		this.Salary = salary;
	}
	
	public int getId(){
		return this.id;
	}
	public int getSalary(){
		return this.Salary;
	}
	public String getName(){
		return this.name;
	}
	
}
