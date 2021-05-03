
public class Student extends User {

	public String studentNumber;
	public String school;
	
	public Student() {
		
	}
	
	public Student(String studentNumber,String school) {
		super();
		this.studentNumber=studentNumber;
		this.school=school;
	}
	
	public String getstudentNumber() {
		return studentNumber;
	}
	
	public void setstudentNumber(String studentNumber) {
		this.studentNumber=studentNumber;
	}
	
	public String getscholl() {
		return school;
	}
	
	public void setscholl(String school) {
		
		this.school= school;
	}

}
