package ie.cit.teamphoenix.DAO;

import ie.cit.teamphoenix.Family;
import ie.cit.teamphoenix.MessageService;

public interface MessageServiceDAO {

	void addMessageService(MessageService messageService);
	
	void updateMessageService(MessageService messageService);
	
	void deleteMessageService(MessageService messageService);
	
	MessageService findMessageServucebyDPSId(int dpsId);
	
	
}
