
public class InstructorManager {
	
	public void add(Instructor instructor) {
		
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " isimli eðitmenin" + instructor.getcourseName() + " kursu eklendi");
		
	}
	
	public void addMultiple(Instructor[] instructor) {
		
		for (Instructor instructor2 : instructor) {
			add(instructor2);
		}
	}

}
