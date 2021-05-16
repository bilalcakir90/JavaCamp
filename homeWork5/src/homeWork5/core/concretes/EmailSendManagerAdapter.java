package homeWork5.core.concretes;

import homeWork5.core.abstracts.EmailSendService;
import homeWork5.emailService.EmailSendManager;

public class EmailSendManagerAdapter implements EmailSendService {
	
	private EmailSendManager emailSendManager;

	@Override
	public void emailSend(String email) {
		EmailSendManager emailSendManager = new EmailSendManager();
		emailSendManager.emailSending(email);
		
	}

}
