
public class StudentManager {
	
	public void add(Student student) {
		System.out.println(student.getstudentNumber() + " öğrenci numaralı" + " " +student.getFirstName()+ " "+ student.getLastName()+" isimli öğrenci" + " " +student.getscholl()+ " santraç kulübüne kayıt yaptırmıştır.");
	}
	
	public void update(Student student) {
		System.out.println(student.getstudentNumber());
		
		System.out.println(student.getFirstName() + student.getLastName() + "isimli öğrencinin numarası" + student.getstudentNumber() + "olarak güncellendi.");
		
	}
}
