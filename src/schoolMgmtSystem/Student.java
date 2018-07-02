package schoolMgmtSystem;


/*
 * This class is for the Student attributes 
 *  in the SchoolManagementSystem.
 * 
 * Student can have attributes like id, name,
 * fees paid, fees total and grade.
 * 
 */


public class Student {
	private int id;
	private String name;
	private int feesPaid;
	private int feesTotal;
	private int grade;
	
	/*
	 * Initialize Student Object
	 * @param id, name, grade
	 * feesTotal for every Student is $30,000.
	 * feesPaid at the beginning of the year is $0.
	 * 
	 */
	
	public Student(int id, String name, int grade){
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.feesPaid = 0;
		this.feesTotal = 30000;
	}
	
	/*
	 * Write Setters for the class
	 * No setters for id, name of the student
	 * 
	 */
	public void setGrade(int grade){
		this.grade = grade;
	}
	public void setFeesTotal(int feesTotal){
		this.feesTotal = feesTotal;
	}
	public void updateFeesPaid(int fees){
		this.feesPaid += fees;
	}
	
	/*
	 * Write getters for the attributes
	 */
	
	public int getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public int getGrade(){
		return this.grade;
	}
	public int getFeesTotal(){
		return this.feesTotal;
	}
	public int getFeesPaid(){
		return this.feesPaid ;
	}
	
	
	
	
}
