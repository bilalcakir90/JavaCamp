
public class Instructor extends User {

	
	public String courseName;
	public String department;
	public int experiance;
	
	public Instructor () {
		
	}
	
	public Instructor(String courseName,String department,int experiance) {
		super();
		this.courseName=courseName;
		this.department=department;
		this.experiance=experiance;
	}
	
	public  String getcourseName() {
		return courseName;
		
	}
	
	public void  setcourseName(String courseName) {
		this.courseName=courseName;
	}
	
	public String getdepartment () {
		return department;
	}
	
	public void setdepartment(String department) {
		this.department=department;
	}
	
	public int getexperiance() {
		return experiance;
	}
	
	public void setexperiace(int experiance) {
		this.experiance=experiance;
	}
	

}
