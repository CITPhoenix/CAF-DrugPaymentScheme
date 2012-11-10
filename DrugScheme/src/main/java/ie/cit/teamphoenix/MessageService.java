package ie.cit.teamphoenix;

public class MessageService {

	int dpsId;
	boolean printed;
	boolean posted;
	boolean unknown;
	
	public MessageService(){
		
	}
	
	public MessageService(int dpsId, boolean printed, boolean posted,
			boolean unknown) {
		super();
		this.dpsId = dpsId;
		this.printed = printed;
		this.posted = posted;
		this.unknown = unknown;
	}

	public int getDpsId() {
		return dpsId;
	}

	public void setDpsId(int dpsId) {
		this.dpsId = dpsId;
	}

	public boolean isPrinted() {
		return printed;
	}

	public void setPrinted(boolean printed) {
		this.printed = printed;
	}

	public boolean isPosted() {
		return posted;
	}

	public void setPosted(boolean posted) {
		this.posted = posted;
	}

	public boolean isUnknown() {
		return unknown;
	}

	public void setUnknown(boolean unknown) {
		this.unknown = unknown;
	}

	@Override
	public String toString() {
		return "MessageService [dpsId=" + dpsId + ", printed=" + printed
				+ ", posted=" + posted + ", unknown=" + unknown + "]";
	}
	
	
	
	
	
}
