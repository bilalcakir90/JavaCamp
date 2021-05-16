package homeWork5.core.abstracts;

public interface EmailCheckService {
	boolean emailCheck (String email);
	void getVerificationLink (String email);

}
