package schoolMgmtSystem;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// This is the main method that runs the school management system
		
		
		Teacher alia = new Teacher(1,"Alia",2000);
		Teacher bronco = new Teacher(2,"Bronco",1600);
		Teacher catalina = new Teacher(3,"Catalina",1500);
		Teacher doug = new Teacher(4,"Doug",1700);
	    ArrayList<Teacher> teachersList = new ArrayList<Teacher>();
	    teachersList.add(alia);
	    teachersList.add(bronco);
	    teachersList.add(catalina);
	    teachersList.add(doug);
	    
		
	    Student john = new Student(1,"John",4);
	    Student kiely = new Student(2,"Kiely",5);
	    Student melissa = new Student(3,"Melissa",3);
	    Student nintendo = new Student(4,"Nintendo",8);
	    ArrayList<Student> studentList = new ArrayList<Student>();
	    studentList.add(john);
	    studentList.add(kiely);
	    studentList.add(melissa);
	    studentList.add(nintendo);
	    john.updateFeesPaid(15000);
	    kiely.updateFeesPaid(10000);
	    melissa.updateFeesPaid(8000);
	    nintendo.updateFeesPaid(2000);
	    
		School svm = new School(studentList,teachersList);
		Student oleg = new Student(5,"Oleg",6);
		svm.addStudent(oleg);
		System.out.println("School has "+svm.getMoneyEarned()+" from students");
		System.out.println("School has to give "+svm.getTotalExpenditure() +" to teachers");
        System.out.println("School savings are "+ (svm.getMoneyEarned()-svm.getTotalExpenditure()));		

	}

}
