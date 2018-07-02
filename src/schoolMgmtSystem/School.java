package schoolMgmtSystem;

import java.util.ArrayList;

public class School {
	
	/*
	 * This is the class for School
	 * Its attributes include teachers, students, Total funds, 
	 * total expenditure
	 * 
	 */
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Teacher> teachers = new ArrayList<Teacher>();
	private int moneyEarned;
	private int totalExpenditure;
	
	
	/*
	 * Write Constructor for the class
	 * 
	 */
	
	public School(ArrayList<Student> students, ArrayList<Teacher> teachers) {
		this.students = students;
		this.teachers = teachers;
		this.totalExpenditure = 0;
		this.moneyEarned = 0;
	}


	public ArrayList<Student> getStudents() {
		return students;
	}


	public void addStudent(Student student) {
		this.students.add(student);
	}


	public ArrayList<Teacher> getTeachers() {
		return teachers;
	}


	public void addTeacher(Teacher teacher) {
		this.teachers.add(teacher);
	}


	public int getMoneyEarned() {
		for(Student s: students){
			this.moneyEarned += s.getFeesPaid();
		}
		return moneyEarned;
	}


	public void updatemoneyEarned(int moneyEarned) {
		this.moneyEarned += moneyEarned;
	}


	public int getTotalExpenditure() {
		for(Teacher t: teachers){
			this.totalExpenditure += t.getSalary();
		}
		return totalExpenditure;
	}


	public void updateTotalExpenditure(int Expenditure) {
		this.totalExpenditure += Expenditure;
	}
	
	
}
