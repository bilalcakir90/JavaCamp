
public class StudentManager {
	
	public void add(Student student) {
		System.out.println(student.getstudentNumber() + " ��renci numaral�" + " " +student.getFirstName()+ " "+ student.getLastName()+" isimli ��renci" + " " +student.getscholl()+ " santra� kul�b�ne kay�t yapt�rm��t�r.");
	}
	
	public void update(Student student) {
		System.out.println(student.getstudentNumber());
		
		System.out.println(student.getFirstName() + student.getLastName() + "isimli ��rencinin numaras�" + student.getstudentNumber() + "olarak g�ncellendi.");
		
	}
}
