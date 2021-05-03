
public class Main {

	public static void main(String[] args) {
	
		
		System.out.println("***users***");
		 System.out.println("-----------------------------------------------------");
		User user = new User();
		
		 user.setId(1);
		 user.setFirstName("Ali");
		 user.setLastName("AK");
		 
		 User user1 = new User();
		 
		 user1.setId(2);
		 user1.setFirstName("Ahmet");
		 user1.setLastName("Akkaya");
		 
		 User user2 = new User();
		 
		 user.setId(3);
		 user2.setFirstName("Hakan");
		 user2.setLastName("Tan");
		 
		 User [] addNewUser = {user,user1,user2};
		 UserManager kyd = new UserManager();
		 kyd.addMultiple(addNewUser);
		 System.out.println("");
		 System.out.println("-----------------------------------------------------");
		 System.out.println("kayýtlar baþarýlý þekilde oluþturuldu");
		 System.out.println("-----------------------------------------------------");
		 
		 System.out.println("**Instructors**");
		 
		 Instructor instructor = new Instructor();
		 
		
		 instructor.setFirstName("Engin");
		 instructor.setLastName("Demiroð");
		 instructor.setcourseName("Java");
		 instructor.setdepartment("IT");
		 instructor.setexperiace(15);
		 
		 Instructor instructor1 = new Instructor();
		 
		 instructor1.setFirstName("Murat");
		 instructor1.setLastName("Kara");
		 instructor1.setcourseName("C#");
		 instructor1.setdepartment("IT");
		 instructor1.setexperiace(4);
		 
		   
		 InstructorManager instructorManager = new InstructorManager();
		 
		 
		 Instructor instructor2[]= {instructor,instructor1};
		 
		 instructorManager.addMultiple(instructor2);
		 
		 System.out.println("-----------------------------------------------------");
		 System.out.println("kayýtlar baþarýlý þekilde oluþturuldu");
		 System.out.println("-----------------------------------------------------");
		 
		 System.out.println("");
		 
		 System.out.println("***Student***");
		 
		 Student student = new Student();
		 student.setFirstName("Hüseyin");
		 student.setLastName("Koç");
		 student.setscholl("Dokuz Eylül Üniversitesi");
		 student.setstudentNumber("203798712");
		 
		 StudentManager studentManager = new StudentManager();
		 
		 studentManager.add(student);
		 
		 
		 
		 
		
		

	}

}
